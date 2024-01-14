package com.practise.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practise.learnjpaandhibernate.course.jdbc.CourseDao;
import com.practise.learnjpaandhibernate.course.jpa.JpaRepositoryDemo;
import com.practise.learnjpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepo;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner{

//	@Autowired
//	private CourseDao repo;
	
//	@Autowired
//	private JpaRepositoryDemo repo;
	
	
	@Autowired
	private CourseSpringDataJpaRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Course(1, "bhaskar JPA", "test"));
		repo.save(new Course(2, "bhaskar2 JPA", "test2"));
		repo.save(new Course(3, "bhaskar2 JPA", "test3"));
		
		repo.deleteById(2l);
		
		System.out.println(repo.findById(1l));
		System.out.println(repo.findById(3l));
		
		System.out.println(repo.findAll());
		System.out.println(repo.count());
		
		System.out.println(repo.findByAuthor("test3"));
		System.out.println(repo.findByName("bhaskar JPA"));
		
	}

}
