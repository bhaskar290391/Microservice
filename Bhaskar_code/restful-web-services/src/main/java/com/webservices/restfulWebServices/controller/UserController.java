package com.webservices.restfulWebServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.restfulWebServices.exception.UserNotFoundException;
import com.webservices.restfulWebServices.model.User;
import com.webservices.restfulWebServices.services.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(produces = {"application/json"},path="/users")
	public List<User> fetchAllUser() {
		return service.fetctUser();
	}

	@GetMapping(path="/users/{id}",produces = {"application/json"})
	public EntityModel<User> findUserByUserId(@PathVariable int id) {
		User user = service.findById(id);

		if (user == null) {
			throw new UserNotFoundException("user is not Found for id" + id);
		}
		
		EntityModel<User> model=EntityModel.of(user);
		WebMvcLinkBuilder link=WebMvcLinkBuilder.linkTo(methodOn(this.getClass()).fetchAllUser());
		model.add(link.withRel("all-user"));

		return model;
	}

	@DeleteMapping(path="/users/{id}")
	public void deleteUserByUserId(@PathVariable int id) {
		service.deleteById(id);
	}

	@PostMapping(path="/users",consumes ={"application/json"})
	public ResponseEntity<List<User>> addUsers(@Valid @RequestBody User user) {
		List<User> savedUser = service.adduser(user);

		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
}
