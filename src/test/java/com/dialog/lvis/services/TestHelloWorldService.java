package com.dialog.lvis.services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"  
			
								  })

public class TestHelloWorldService {

	
	@Autowired
	@Qualifier("helloWorldService")
	private HelloWorldService helloWorldService;
	
	@Test
	public void testHelloWorldService() {
		String message = helloWorldService.sayHi("MYNAME");
		assertEquals("Hi MYNAME FROM LVIS", message);
	}

}
