package com.github.drunk2013.jdbc_support.service;

import java.util.List;

import com.github.drunk2013.jdbc_support.model.Student;

public interface StudentService {
	public int addStudent(Student student);

	public int deleteStudent(int id);

	public int updateStudent(Student student);

	public List<Student> findStudents();
}
