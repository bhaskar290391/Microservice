package com.webservices.restfulWebServices.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.webservices.restfulWebServices.model.User;

@Component
public class UserService {

	private static List<User> users = new ArrayList<>();

	private static int userCount = 0;

	static {
		users.add(new User(++userCount, "bhaskar", LocalDate.now().minusYears(10)));
		users.add(new User(++userCount, "Soni", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "Kanishk", LocalDate.now().minusYears(50)));
		users.add(new User(++userCount, "babu", LocalDate.now().minusYears(25)));
	}

	public List<User> fetctUser() {
		return users;
	}

	public User findById(int id) {

		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);

	}

	public List<User> adduser(User user) {
		user.setId(++userCount);
		users.add(user);
		return users;
		
	}

}
