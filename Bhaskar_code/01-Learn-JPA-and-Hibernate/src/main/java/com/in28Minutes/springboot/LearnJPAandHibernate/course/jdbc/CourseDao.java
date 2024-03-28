package com.in28Minutes.springboot.LearnJPAandHibernate.course.jdbc;

import com.in28Minutes.springboot.LearnJPAandHibernate.course.Course;

public interface CourseDao {

	public Course findCourseById(long id);

	void saveCourse(Course theCourse);

	void deleteCourseById(long id);
}
