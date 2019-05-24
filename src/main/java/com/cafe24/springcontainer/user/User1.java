package com.cafe24.springcontainer.user;

import org.springframework.stereotype.Component;

@Component
//@Component("user2") 이름 지정 가능
public class User1 {
	public String getName() {
		return "사용자1";
	}
}
