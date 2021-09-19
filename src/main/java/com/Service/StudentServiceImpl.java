package com.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.DAO.StudentDAOImp;
import com.Entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDAOImp studentDAOImp;
	
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		
		return studentDAOImp.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	 
	@Override
	@Transactional
	public Student getStudent(int theId) {
		// TODO Auto-generated method stub
		return studentDAOImp.getStudent(theId);
	}

	@Override
	@Transactional
	public void deleteStudent(int theId) {
		// TODO Auto-generated method stub
		
	}

}
