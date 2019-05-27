package com.cafe24.springcontainer.videosystem;

public class IronMan implements DigitalVideoDisc {

	private String title = "Avengers";
	private String studio = "IRONMAN";
	
	@Override
	public void play() {
		System.out.println("Playing Movie "+ studio + "'s " +title);
	}

}
