package com.akumasoft.users.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreateRequest {

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
	@NotBlank(message = "SecondName is required")
	private String SecondName;
	
	@JsonProperty("SecondLastName")
	@NotBlank(message = "SecondLastName is required")
	private String SecondLastName;
	
	@JsonProperty("Email")
	@NotBlank(message = "Email is required")
	private String Email;
	
	@JsonProperty("Tag")
	@NotBlank(message = "Tag is required")
	private String Tag;
	
}
