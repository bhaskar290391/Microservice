package com.practise.springboot.LearnSpringBoot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.springboot.LearnSpringBoot.model.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getListOfCourse() {

		return Arrays.asList(new Course(1, "learn AWS", "In28MInutes"), new Course(2, "learn DevOpps", "In28MInutes"),
				new Course(3, "learn Azure", "In28MInutes"));
	}
}
