package com.akumasoft.users.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akumasoft.users.response.*;
import com.akumasoft.users.service.UserService;

import jakarta.validation.Valid;

import com.akumasoft.users.entity.User;
import com.akumasoft.users.request.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userServ;
	/*
	 * CRUD 
	 * */
	@GetMapping("/Read/{UserID}")
	public ReadResponse ReadUser(@PathVariable Long UserID ) {
		User usr =  userServ.Read(UserID);
		ReadResponse rsp = new ReadResponse(usr); 
		return rsp;
	}
	
	@PostMapping("/Create")
	public CreateResponse Create(@Valid @RequestBody CreateRequest rq) {
		User user = userServ.Create(rq);
		return new CreateResponse(user);
	}
	
	@PutMapping("/Update")
	public UpdateResponse Update(@Valid @RequestBody UpdateRequest rq) {
		User user = userServ.Update(rq);
		return new UpdateResponse(user);
	}
	
	@DeleteMapping("/Delete/{UserID}")
	public String Delete(@PathVariable long UserID) {
		userServ.Delete(UserID);
		return "Delete Completed";
	}
	/*
	 * CRUD FIN 
	 * */
	/*@PostMapping("/Search")
	public SearchResponse Create(@RequestBody SearchRequest rq) {
		List<User> userSearch = userServ.SearchUsers(rq);
		SearchResponse rsp = new SearchResponse(userSearch);
		return rsp;
	}*/
	
	@GetMapping("/All")
	public SearchResponse getAll() {
		List<User> userSearch = userServ.getAll();
		SearchResponse rsp = new SearchResponse(userSearch);		
		return rsp;
	}
	
}
