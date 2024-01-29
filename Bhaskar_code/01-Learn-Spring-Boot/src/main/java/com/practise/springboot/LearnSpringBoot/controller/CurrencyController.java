package com.practise.springboot.LearnSpringBoot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practise.springboot.LearnSpringBoot.config.CurrencyServiceConfiguration;
import com.practise.springboot.LearnSpringBoot.model.Course;

@RestController
public class CurrencyController {

	@Autowired
	private CurrencyServiceConfiguration config;
	
	@GetMapping("/currency")
	public CurrencyServiceConfiguration getListOfCourse() {

		return config;
	}
}
