package com.student.scores;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.student.scores.ScoresApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ScoresApplication.class)
@WebAppConfiguration
public class ScoresApplicationTests {

	@Test
	public void contextLoads() {
	}
}
