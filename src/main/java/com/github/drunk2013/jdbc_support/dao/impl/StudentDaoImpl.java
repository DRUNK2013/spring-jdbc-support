package com.github.drunk2013.jdbc_support.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.github.drunk2013.jdbc_support.dao.StudentDao;
import com.github.drunk2013.jdbc_support.model.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {
	
	@Override
	public int addStudent(Student student) {
		String sql="insert into student(name,age) values(?,?)";
		Object []params = new Object[]{student.getName(),student.getAge()};
		return this.getJdbcTemplate().update(sql,params);
	}

	@Override
	public int deleteStudent(int id) {
		String sql="delete from student where id=?";
		Object []params = new Object[]{id};
		return this.getJdbcTemplate().update(sql,params);
	}

	@Override
	public int updateStudent(Student student) {
		String sql="update student set name=?,age=? where id=?";
		Object []params = new Object[]{student.getName(),student.getAge(),student.getId()};
		return this.getJdbcTemplate().update(sql,params);
	}

	@Override
	public List<Student> findStudents() {
		String sql="select * from student";
		final List<Student> studentList=new ArrayList<Student>();
		this.getJdbcTemplate().query(sql, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				studentList.add(student);
			}
		});
		return studentList;
	}

}
