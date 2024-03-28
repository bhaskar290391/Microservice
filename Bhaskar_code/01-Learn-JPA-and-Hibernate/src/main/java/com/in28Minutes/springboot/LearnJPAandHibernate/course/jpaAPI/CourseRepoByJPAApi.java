package com.in28Minutes.springboot.LearnJPAandHibernate.course.jpaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28Minutes.springboot.LearnJPAandHibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseRepoByJPAApi {

	@Autowired
	private EntityManager manager;

	public void save(Course theCourse) {
		manager.merge(theCourse);
	}

	
	public Course findById(long id) {
		return manager.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		Course theCourse= manager.find(Course.class, id);
		manager.remove(theCourse);
	}
}
