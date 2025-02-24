package com.akumasoft.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.akumasoft.users.response.*;

@RestController
@RequestMapping("/users")
public class UserController {
	@GetMapping("/Read/{UserID}")
	public ReadResponse ReadUser(@PathVariable Long UserID ) {
		ReadResponse rsp = new ReadResponse(null);
		return rsp;
	}
	
	
}
