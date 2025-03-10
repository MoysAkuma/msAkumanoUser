package com.akumasoft.users.response;

import com.akumasoft.users.entity.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateResponse {
	private String Message;
	
	private int StatusCode;
	
	private String Link;
	
	public UpdateResponse(User user) {
		this.StatusCode = 200;
		this.Message = "Edition of user success!";
		if (user == null) {
			this.StatusCode = 500;
			this.Message = "Internal error"; 
		} 
	}
}
