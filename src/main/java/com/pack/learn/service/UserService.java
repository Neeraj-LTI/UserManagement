/**
 * 
 */
package com.pack.learn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pack.learn.model.dto.User;

/**
 * @author 10082567
 *
 */
@Service
public class UserService {
	
	public List<User> fetchUsers() {
		
		return List.of(User.builder()
			.firatName("First")
			.lastName("Last")
			.email("first.last@learn.com")
		.build());
	}

}
