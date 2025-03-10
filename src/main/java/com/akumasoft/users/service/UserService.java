package com.akumasoft.users.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akumasoft.users.entity.*;
import com.akumasoft.users.repository.*;
import com.akumasoft.users.request.*;
@Service
public class UserService {
	@Autowired
	UserRepository userRep;
	
	 /*public List<User> SearchUsers(SearchRequest rq){
		 return userRep.findByNameOrLastNameOrUbicationIDInOrTag(rq.getName(), rq.getLastName(), rq.getUbicationID(), rq.getTag());
	 }*/
	 
	 
	 public List<User> getAll(){
		 Iterable<User> resp = userRep.findAll();
		 List<User> res = new ArrayList<User>();
		 for (User user : resp) {
			 res.add(user);
		}
		 return res;
	 }
	 
	 public User Create(CreateRequest rq) {
		 User usr = new User(rq);
		 usr = userRep.save(usr);
		 return usr;
	 }
	 
	 public User Read(Long id) {
		 User usr = userRep.findById(id).get();
		 return usr;
	 }
	 
	 public User Update(UpdateRequest rq) {
		 User usr = userRep.findById(rq.getUserID()).get();
		 if(usr.getTag() != null && !usr.getTag().isEmpty()) {
			 usr = new User(rq);
		 }
		 usr =  userRep.save(usr);
		 return usr;
	 }
	 
	 public void Delete(Long Id) {
		 userRep.deleteById(Id);
	 }
	 
}
