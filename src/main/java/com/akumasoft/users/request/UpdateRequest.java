package com.akumasoft.users.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateRequest {
	
	@JsonProperty("ID")
	@NotNull(message = "ID is required")
	private Long UserID;
	
	@JsonProperty("SiteID")
	@NotNull(message = "SiteID is required")
	private Long siteID;
	
	@JsonProperty("PasswordID")
	@NotNull(message = "PasswordID is required")
	private Long passID;
	
	@JsonProperty("Name")
	@NotBlank(message = "Name is required")
	private String Name;
	
	@JsonProperty("LastName")
	@NotBlank(message = "LastName is required")
	private String LastName;
	
	@JsonProperty("SecondName")
	private String SecondName;
	
	@JsonProperty("SecondLastName")
	private String SecondLastName;
	
	@JsonProperty("Email")
	@NotBlank(message = "Email is required")
	private String Email;
	
	@JsonProperty("Tag")
	@NotBlank(message = "Tag is required")
	private String Tag;
}
