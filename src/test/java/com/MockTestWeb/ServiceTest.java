package com.MockTestWeb;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.DAO.Sample_for_testDAO;
import com.Entity.Sample_for_test;
import com.Service.Sample_test_service;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

	@InjectMocks
	private Sample_test_service service;
	
	@Mock
	private Sample_for_testDAO dao;
	@Mock
	private Sample_for_test entity;
	
	@Test
	public void test_getById() {
		String str = service.getSample(1).getName(); System.out.println(str);
		//assertEquals("Two", service.getSample(2).getName());
		when(str).thenReturn("One");
		Optional<String> op = Optional.ofNullable(str);
		 
	}
	
	
}
