package com.DaoTests;

 
import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Service.Sample_test_service;

@SpringBootTest
public class Sample_tests {

	@Autowired
	private Sample_test_service service;
	
	@Test
	public void contextLoads() throws Exception {
		System.out.println("SERVICE " + service.getSample(2).getName());
		Assertions.assertThat(service.getSample(2)).isNotNull();
		assertEquals("Two", service.getSample(2).getName());
	}
}
