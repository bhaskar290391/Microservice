package com.practise.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practise.learnjpaandhibernate.course.Course;

@Repository
public class CourseDao {

	@Autowired
	private JdbcTemplate template;

	private static String insert = """
			insert into course(id,name,author)
			values(?,?,?)
			""";

	private static String delete = """
			delete from course where id =?
			""";

	private static String fetch = """
			select * from course where id =?
			""";

	
	public void insert(Course course) {
		template.update(insert,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(long id) {
		template.update(delete,id);
	}
	
	
	public Course findById(long id) {
		return template.queryForObject(fetch, new BeanPropertyRowMapper<>(Course.class), id);
	}
}
