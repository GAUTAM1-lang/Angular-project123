package com.dinesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

//	Have list of Users
	ArrayList<User> Users = new ArrayList<>(Arrays.asList(
			new User("Dinesh", "Bangalore", 001,25000),
			new User("Rahul", "AP", 002,35000),
			new User("Karan", "Delhi", 003,41000),
			new User("Ankit", "Pune", 004,40000)
			));
	
	
//	Fetch All Users
	@RequestMapping("/Users")
	List<User> getAllUsers(){
		return Users;
	}

	
	
	
}
