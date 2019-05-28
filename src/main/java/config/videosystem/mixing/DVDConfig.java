package config.videosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cafe24.springcontainer.videosystem.Avengers;
import com.cafe24.springcontainer.videosystem.BlankDisc;

@Configuration
public class DVDConfig {
	
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	//명시적인 것이 좋다
	@Bean(name="avengersInfinityWar")
	public BlankDisc blankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Avent gers Marlvel");
		blankDisc.setStudio("Avent gers Marlvel");
		return blankDisc;
	}
}
