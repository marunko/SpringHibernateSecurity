package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.Sample_for_test;

@Repository
public class Sample_for_testDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Sample_for_test getOneById(int id) {
		Session session = sessionFactory.openSession();
		Sample_for_test entity = session.get(Sample_for_test.class, id);
		session.close();
		return entity;
	}
}
