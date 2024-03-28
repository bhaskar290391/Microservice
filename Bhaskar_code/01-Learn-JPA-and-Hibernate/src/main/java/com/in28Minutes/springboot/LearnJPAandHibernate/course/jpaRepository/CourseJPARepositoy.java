package com.in28Minutes.springboot.LearnJPAandHibernate.course.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28Minutes.springboot.LearnJPAandHibernate.course.Course;

@Repository
public interface CourseJPARepositoy extends JpaRepository<Course, Long> {

}
