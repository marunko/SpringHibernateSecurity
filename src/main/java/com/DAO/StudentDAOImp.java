package com.DAO;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.Student;

@Repository
public class StudentDAOImp implements StudentDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Student> getStudents() {
		Session session = sessionFactory.openSession();
		List<Student> list = session.createQuery("from Student").list();
		Hibernate.initialize(list);
		session.close();
		return list;
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = (Student) session.load(Student.class, id);
        return student;
	 
	}

	@Override
	public void deleteStudent(int theId) {
		// TODO Auto-generated method stub
		
	}

}
