package com.akumasoft.users.entity;

public class User {
	private long id;
	
	private long profileid;
	
	private long siteID;
	
	private long passID;
	
	private String Name;
	
	private String LastName;
	
	private String SecondName;
	
	private String SecondLastName;
	
	private String Email;
	
	private String CreatedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProfileid() {
		return profileid;
	}

	public void setProfileid(long profileid) {
		this.profileid = profileid;
	}

	public long getSiteID() {
		return siteID;
	}

	public void setSiteID(long siteID) {
		this.siteID = siteID;
	}

	public long getPassID() {
		return passID;
	}

	public void setPassID(long passID) {
		this.passID = passID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSecondName() {
		return SecondName;
	}

	public void setSecondName(String secondName) {
		SecondName = secondName;
	}

	public String getSecondLastName() {
		return SecondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		SecondLastName = secondLastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(String createdDate) {
		CreatedDate = createdDate;
	}
	

}
