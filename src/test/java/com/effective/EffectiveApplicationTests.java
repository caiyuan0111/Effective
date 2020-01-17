package com.effective;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ConcurrentHashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EffectiveApplicationTests {

	@Test
	public void contextLoads() {

		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
	}

}
