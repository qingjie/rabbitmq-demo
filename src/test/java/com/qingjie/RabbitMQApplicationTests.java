package com.qingjie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qingjie.service.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQApplicationTests {

	@Autowired
	private Sender sender;

	@Test
	public void hello() throws Exception {
		sender.send();
	}

}
