package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@Configuration은 이 java클래스가 Spring 환경설정과 관련된 파일이다라는 것을 알려줌 (스프링에서 사용하는 Bean자체로도 인식)
@Configuration
@ComponentScan(basePackages = "com.cafe24.springcontainer.soundsystem")
//@ComponentScan(basePackages= {"com.cafe24.springcontainer.soundsystem", "com.cafe24.springcontainer.videosystem"})
//@ComponentScan(basePackageClasses = Index.class)
//basePackageClasses에 지정한 클래스가 속한 패키지를 basePackage로 사용한다.(Marker Interface)
public class CDPlayerConfig {
	
	
//	@Bean
//	public CompackDisc highSchoHighSchoolRapper3Final(){
//		return new HighSchoolRapper3Final();
//	}
}
