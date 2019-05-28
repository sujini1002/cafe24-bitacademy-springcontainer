package com.cafe24.springcontainer.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	//와이어링 01(멤버변수)
//	@Autowired
	private CompackDisc cd;
	
//	public CDPlayer() {}
	
//	와이어링 02(생성자)
	@Autowired
	public CDPlayer(CompackDisc cd) { //생성자를 이용하여 주입
		this.cd = cd;
	}
		
	public void play() {
		cd.play();
	}
	//와이어링03 (setter)
//	@Autowired
	public void setCompackDisc(CompackDisc cd) {
		this.cd = cd;
	}
	
	//와이어링03 (일반함수)
//	@Autowired
	public void insertCompactDisc(CompackDisc cd) {
		this.cd = cd;
	}
	
}
