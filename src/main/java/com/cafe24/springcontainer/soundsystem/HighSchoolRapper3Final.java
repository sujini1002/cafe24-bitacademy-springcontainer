package com.cafe24.springcontainer.soundsystem;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "highSchoolRapper3Final")
//@Named("highSchoolRapper3Final") 
//@Component를 생략가능하다 @Named를 사용할 때
public class HighSchoolRapper3Final implements CompackDisc {
	
	private String title = "지구멸망";
	private String artist = "양승호";
	
	
	public void play() {
		System.out.println("Playing "+title+" by "+ artist);
	}

}
//config.soundsystem