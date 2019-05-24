package com.cafe24.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cafe24.springcontainer.user.User;
import com.cafe24.springcontainer.user.User1;

public class ContainerTest {

	public static void main(String[] args) {
//		testBeanFactory();
		testApplicationContext();
	}
	
	public static void testApplicationContext() {
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/user/applicationContext.xml");
		//빈 설정
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config/user/applicationContext2.xml");
		//id로 
		//빈 설정 시 오류 : id나 name 설정을 해야 한다.
//		User1 user = (User1)appContext.getBean("user1");
//		System.out.println(user.getName());
		//class로
		User1 user1 = appContext.getBean(User1.class);
		System.out.println(user1.getName());
		
		//name 으로 가져오기
		User user = (User)appContext.getBean("user");
		System.out.println(user);
		//id로 가져오기(권장)
		user = (User)appContext.getBean("usr");
		System.out.println(user);
		
//		오류 : 같은 타입의 Bean이 존재하면 타입으로 getBean()을 가져올 수 없다
//		user = appContext.getBean(User.class);
		
		User user2 = (User)appContext.getBean("usr2");
		System.out.println(user2);
		
		User user3 = (User)appContext.getBean("usr3");
		System.out.println(user3);
		
		User user4 = (User)appContext.getBean("usr4");
		System.out.println(user4);
		
		//자원정리
		((ConfigurableApplicationContext)appContext).close();
	}
	
	public static void testBeanFactory() {
//		ClassPathResource : 
		BeanFactory bf= new XmlBeanFactory(new ClassPathResource("config/user/applicationContext.xml"));

		//Auto-Configuration(==AutoScanning)인 경우 Bean의 id가 자동으로 만들어 진다.
		User1 user = (User1)bf.getBean("user1");//스캐닝 된 componet를 자동으로 id를 설정한다. Object로 가져오기 때문에 casting 필요
		System.out.println(user.getName());
		
		//수동설정(xmlBean 설정인 경우에는 id가 자동으로 부여되지 않음)
		BeanFactory bf2= new XmlBeanFactory(new ClassPathResource("config/user/applicationContext2.xml"));
//		user =  (User1)bf2.getBean("user1");
//		System.out.println(user.getName());
		user = bf2.getBean(User1.class);
		System.out.println(user.getName());
	}

}
