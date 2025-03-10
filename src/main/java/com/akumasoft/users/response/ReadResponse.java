package com.akumasoft.users.response;

import com.akumasoft.users.entity.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReadResponse {
	private Long id;
	
	private Long passID;
	
	private String Tag;
	
	private String Name;
	
	private String LastName;
	
	private String SecondName;
	
	private String SecondLastName;
	
	private String Email;
	
	public ReadResponse(User user) {
		this.id = user.getUserID();
		this.passID = user.getPassID();
		this.Tag = user.getTag();
		this.Name = user.getName();
		this.LastName = user.getLastName();
		this.SecondName = user.getSecondName();
		this.Email = user.getEmail();
	}
}
