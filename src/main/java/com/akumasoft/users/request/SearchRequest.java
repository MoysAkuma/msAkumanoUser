package com.akumasoft.users.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequest {
	
	@JsonProperty("Name")
	public String Name;
	
	@JsonProperty("LastName")
	public String LastName;
	
	@JsonProperty("Tag")
	public String Tag;
	
	@JsonProperty("UbicationListIds")
	public List<Long> ubicationID;
	
}
