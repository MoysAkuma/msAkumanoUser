package com.akumasoft.users.response;
import java.util.List;

import com.akumasoft.users.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class SearchResponse {
	@JsonProperty("statuscode")
	 private long CodeStatus;
	
	@JsonProperty("results")
	private List<User> Results;
	 
	 public SearchResponse(List<User> rsp) {
		 long CodeStatus = 200;
		 
		 if(rsp.isEmpty()) {
			 CodeStatus = 404;
		 }		 
		 this.CodeStatus = CodeStatus;
		 this.Results = rsp;
	 } 
}
