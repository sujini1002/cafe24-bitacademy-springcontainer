package config.user;

import org.springframework.context.annotation.Bean;

import com.cafe24.springcontainer.user.User;

public class UserConfig01 {
	
	@Bean //bean을 리턴하는 유저
	public User user() {
		
		return new User();
	}
}
