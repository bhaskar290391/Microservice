package com.practise.learnjpaandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practise.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JpaRepositoryDemo {

	@Autowired
	private EntityManager maneger;

	public void insert(Course course) {
		maneger.merge(course);
	}

	public Course findById(long Id) {
		return maneger.find(Course.class, Id);
	}

	public void delete(long Id) {
		Course course = maneger.find(Course.class, Id);
		maneger.remove(course);
	}
}
