package com.akumasoft.users.response;

import com.akumasoft.users.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CreateResponse {
	
	private String Message;
	
	private int StatusCode;
	
	private String Link;
	
	public CreateResponse(User user) {
		this.StatusCode = 200;
		this.Message = "Creation of user success!";
		if (user != null) {
			this.StatusCode = 500;
			this.Message = "Internal error"; 
		} 
	}
}
