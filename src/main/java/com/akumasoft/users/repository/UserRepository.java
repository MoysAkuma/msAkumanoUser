package com.akumasoft.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.akumasoft.users.entity.*;
import java.util.List;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long>, CrudRepository<User, Long> {
	
	/*User findById(long id);
	
	List<User> findByTag(String Tag);
	
	List<User> findByEmail(String Email);
	
	List<User> findByNameOrLastNameOrUbicationIDInOrTag(String Name, String LastName, List<Long> ubicationIds, String Tag);*/
	
}
