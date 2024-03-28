package com.in28Minutes.springboot.LearnJPAandHibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28Minutes.springboot.LearnJPAandHibernate.course.Course;

@Repository
public class CourseDaoImpl implements CourseDao{

	@Autowired
	JdbcTemplate template;
	
	public static final String INSERT_QUERY="""
			insert into course 
			values (?,?,?);
			""";
	
	public static final String DELETE_QUERY="""
			DELETE FROM  course 
			WHERE ID=?;
			""";
	
	public static final String SELECT_QUERY="""
			SELECT * FROM course 
			WHERE ID =?;
			""";
	
	@Override
	public void saveCourse(Course theCourse) {
			template.update(INSERT_QUERY,theCourse.getId(),theCourse.getName(),theCourse.getAuthor());
	}

	@Override
	public void deleteCourseById(long id) {
		template.update(DELETE_QUERY,id);
	}

	@Override
	public Course findCourseById(long id) {
		Course theCourse=template.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
		return theCourse;
	}

}
