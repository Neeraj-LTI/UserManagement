/**
 * 
 */
package com.pack.learn.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 10082567
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	private String firatName;
	private String lastName;
	private String email;
	
}
