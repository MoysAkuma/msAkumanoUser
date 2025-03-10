package com.akumasoft.users.entity;
import com.akumasoft.users.request.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "userID")
	private Long UserID;
	
	@Column(name = "tag")
	@NotNull
	private String Tag;
	
	@Column(name = "siteID")
	@NotNull
	private Long siteID;
	
	@Column(name = "passID", nullable = true)
	private Long passID;
	
	@Column(name = "ubicationID")
	private Long ubicationID;
	
	@Column(name = "name", nullable = true)
	private String Name;
	
	@Column(name = "lastName", nullable = true)
	private String LastName;
	
	@Column(name = "secondName", nullable = true)
	private String SecondName;
	
	@Column(name = "secondLastName", nullable = true)
	private String SecondLastName;
		
	@Column(name = "email")
	private String Email;
	
	@Column(name = "createdDate", nullable = true)
	private String createdDate;
	
	@Column(name = "lastUpdated", nullable = true)
	private String LastUpdatedDate;
	
	public User(CreateRequest createUserrq) {
		this.siteID = createUserrq.getSiteID();
		this.passID = createUserrq.getPassID();
		this.Tag = createUserrq.getTag();
		this.Name = createUserrq.getName();
		this.LastName = createUserrq.getLastName();
		this.SecondName = createUserrq.getSecondName();
		this.SecondLastName = createUserrq.getSecondLastName();
		this.Email = createUserrq.getEmail();
	}
	
	public User(UpdateRequest updateUserrq) {
		this.UserID = updateUserrq.getUserID();
		this.siteID = updateUserrq.getSiteID();
		this.passID = updateUserrq.getPassID();
		this.Tag = updateUserrq.getTag();
		this.Name = updateUserrq.getName();
		this.LastName = updateUserrq.getLastName();
		this.SecondName = updateUserrq.getSecondName();
		this.SecondLastName = updateUserrq.getSecondLastName();
		this.Email = updateUserrq.getEmail();
	}
}
