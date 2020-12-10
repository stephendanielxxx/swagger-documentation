package com.backend.documentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(value = "User API", description = "API Collections for user.")
public class UserController {
	
	@GetMapping("/{id}")
	@ApiOperation(value = "This api function is to get user model by specific id", response = UserModel.class)
	public UserModel getUserById(@PathVariable int id) {
		UserModel userModel = new UserModel();
		userModel.setUserId(1);
		userModel.setUserName("Tri");
		userModel.setUserAddress("Poris, Tangerang");
		userModel.setAge(23);
		
		return userModel;
	}
	
	@PostMapping
	public UserModel createUser(@RequestBody UserModel userModel) {
		/*
		 * save user model to database here
		 */
		return userModel;
	}
	
	
}
