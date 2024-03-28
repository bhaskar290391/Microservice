package com.in28Minutes.springboot.LearnJPAandHibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.in28Minutes.springboot.LearnJPAandHibernate.course.Course;
import com.in28Minutes.springboot.LearnJPAandHibernate.course.jdbc.CourseDao;
import com.in28Minutes.springboot.LearnJPAandHibernate.course.jpaAPI.CourseRepoByJPAApi;
import com.in28Minutes.springboot.LearnJPAandHibernate.course.jpaRepository.CourseJPARepositoy;


@SpringBootApplication
public class LearnJpaAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJpaAndHibernateApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner(CourseDao dao,CourseRepoByJPAApi repo,CourseJPARepositoy jpaRepo) {
		return runner->{
			//UsingSpringJDBC(dao);
			usingJPAApi(repo);
			//UsingJPARepository(jpaRepo);
		};
	}


	private void usingJPAApi(CourseRepoByJPAApi repo) {
		repo.save(new Course(1, "Bhaskar", "Maddy"));
		repo.save(new Course(2, "Maddy", "Maddy"));
		repo.save(new Course(3, "Kanishk", "Maddy"));
		
		repo.deleteById(2l);
		
		System.out.println(repo.findById(1l));
		
		System.out.println(repo.findById(3l));
	}


	private void UsingJPARepository(CourseJPARepositoy jpaRepo) {
		
		jpaRepo.save(new Course(1, "Bhaskar", "Maddy"));
		jpaRepo.save(new Course(2, "Maddy", "Maddy"));
		jpaRepo.save(new Course(3, "Kanishk", "Maddy"));
		
		jpaRepo.deleteById(2l);
		System.out.println(jpaRepo.findAll());
		
		System.out.println(jpaRepo.findById(1l));
		
		System.out.println(jpaRepo.findById(3l));
	}


	private void UsingSpringJDBC(CourseDao dao) {
		dao.saveCourse(new Course(1, "Bhaskar", "Maddy"));
		dao.saveCourse(new Course(2, "Maddy", "Maddy"));
		dao.saveCourse(new Course(3, "Kanishk", "Maddy"));
		
		dao.deleteCourseById(2);
		
		System.out.println(dao.findCourseById(3));
	}
}
