package com.DAO;

import java.util.List;

import com.Entity.Student;

public interface StudentDAO {
	public List <Student> getStudents();

    public void saveStudent(Student student);

    public Student getStudent(int theId);

    public void deleteStudent(int theId);
}
