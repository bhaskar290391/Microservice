package com.webservices.restfulWebServices.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.restfulWebServices.model.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource source;

	@GetMapping(path="/helloWorld",produces = {"application/json"})
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping(path="/helloWorldBean",produces = {"application/json"})
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path="/helloWorld/path-variable/{name}",produces = {"application/json"})
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello Message ,%s", name));
	}
	
	@GetMapping(path="/helloWorld-I18n",produces = {"application/json"})
	public String helloWorldI18n() {
		Locale locale=LocaleContextHolder.getLocale();
		return source.getMessage("messages.good.morning", null, "default", locale);
		
	}
}
