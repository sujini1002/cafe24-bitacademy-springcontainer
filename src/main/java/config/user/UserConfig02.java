package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.user.User;

@Configuration //컨피그의 설정이 되어 있는 자바 클래스이다. 꼭 달아주기!!! / 톰캣이 컨피규레이션으로 접근하므로 
public class UserConfig02 {
	
	@Bean //bean을 리턴하는 유저
	public User user() {
		
		return new User();
	}
}
