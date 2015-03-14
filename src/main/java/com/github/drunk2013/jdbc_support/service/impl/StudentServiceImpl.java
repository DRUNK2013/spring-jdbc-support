package com.github.drunk2013.jdbc_support.service.impl;

import java.util.List;

import com.github.drunk2013.jdbc_support.dao.StudentDao;
import com.github.drunk2013.jdbc_support.model.Student;
import com.github.drunk2013.jdbc_support.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public int addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public int deleteStudent(int id) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(id);
	}

	@Override
	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student);
	}

	@Override
	public List<Student> findStudents() {
		
		return studentDao.findStudents();
	}

}
