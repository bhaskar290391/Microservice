package com.practise.learnjpaandhibernate.course.springDataJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practise.learnjpaandhibernate.course.Course;
import java.util.List;


public interface CourseSpringDataJpaRepo extends JpaRepository<Course, Long>{

	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String name);
}
