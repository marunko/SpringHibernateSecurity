package com.Service;

import java.util.List;

import com.Entity.Student;

public interface StudentService {

	public List <Student> getStudents();

    public void saveStudent(Student student);

    public Student getStudent(int theId);

    public void deleteStudent(int theId);

}
