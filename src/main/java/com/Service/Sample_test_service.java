package com.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.Sample_for_testDAO;
import com.Entity.Sample_for_test;

 

@Service
public class Sample_test_service {

	@Autowired
	private Sample_for_testDAO dao;
	
	@Transactional
	public Sample_for_test getSample(int id) {
		return dao.getOneById(id);
	}
}
