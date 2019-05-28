package com.cafe24.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.CDPlayerConfig;

// Auto Configuration - Java Config
// Component Scanning(@Component,(or @Named - java 표준), @Autowired, (or @ Inject - java 표준)

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerJavaConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private CompackDisc cd; // cd가 잘 만들었는지 확인하는 용도

	
	@Autowired
	private CDPlayer player; //실제론 얘가 잘 주입 받아야함
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void testPlayerNull() {
		assertNotNull(player);
	}
	
	@Test
	public void testPlay() {
		player.play();
		assertEquals("Playing 지구멸망 by 양승호\r\n",systemOutRule.getLog());
	}
}
