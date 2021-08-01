/**
 * 
 */
package com.pack.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.learn.model.dto.User;
import com.pack.learn.service.UserService;

/**
 * @author 10082567
 *
 */
@RestController
public class UsersController {

	@Autowired
	UserService userSvc;
	
	/**
	 * REST end point to fetch the list of users
	 * @return
	 */
	@GetMapping(path = "/users")
	public ResponseEntity<List<User>> fetchUsers() {
		
		return ResponseEntity.status(HttpStatus.OK).body(userSvc.fetchUsers());
		
	}
}
