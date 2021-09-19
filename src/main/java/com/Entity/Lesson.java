package com.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="lesson")
public class Lesson {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	/*
	@ManyToMany
    @JoinTable(name = "student_lesson",
            //
            joinColumns = @JoinColumn(name = "student_id"),
            //
            inverseJoinColumns = @JoinColumn(name = "lesson_id"))
	*/
	@ManyToMany(mappedBy="lessons")
	Set<Student> students = new HashSet<>();
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudent(){
		return students;
	}
	public void setStudent(Set<Student> students) {
		this.students = students;
	}
	
}
