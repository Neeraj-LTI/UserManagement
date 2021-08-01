/**
 * 
 */
package com.pack.learn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.learn.model.dto.User;

/**
 * @author 10082567
 *
 */
@RestController
public class UsersController {

	/**
	 * REST end point to fetch the list of users
	 * @return
	 */
	@GetMapping(path = "/users")
	public ResponseEntity<User> fetchUsers() {
		
		return ResponseEntity.status(HttpStatus.OK).body(User.builder()
				.firatName("First").
				lastName("Last")
				.email("first.last@learn.com")
			.build());
		
	}
}
