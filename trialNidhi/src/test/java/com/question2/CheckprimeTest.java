package com.question2;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CheckprimeTest {
	@Test
	public void check() {
		Checkprime p = new Checkprime();
		boolean k = p.check(3);
		Assert.assertEquals(k,true);
	}

}
