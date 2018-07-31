package com.strandlie.lambda.person;

import common.APIResponse;

public class PersonResponse extends APIResponse {
	
	private boolean personIsAdded;
	private boolean personIsUpdated;
	private boolean personIsDeleted;
	
	public boolean getPersonIsAdded() {
		return personIsAdded;
	}
	
	public void setPersonIsAdded(boolean personIsAdded) {
		this.personIsAdded = personIsAdded;
	}
	
	public boolean getPersonIsUpdated() {
		return personIsUpdated;
	}
	
	public void setPersonIsUpdated(boolean personIsUpdated) {
		this.personIsUpdated = personIsUpdated;
	}
	
	public boolean getPersonIsDeleted() {
		return personIsDeleted;
	}

	public void setPersonIsDeleted(boolean personIsDeleted) {
		this.personIsDeleted = personIsDeleted;
	}
	
	public String getFirstName() {
		return this.fields().getOrDefault("firstName", null);
	}
	
	public void setFirstName(String firstName) {
		this.fields().put("firstName", firstName);
	}
	
	public String getLastName() {
		return this.fields().getOrDefault("lastName", null);
	}

	public void setLastName(String lastName) {
		this.fields().put("lastName", lastName);
	}

	public String getEmail() {
		return this.fields().getOrDefault("email", null);
	}

	public void setEmail(String email) {
		this.fields().put("email", email);
	}

	public String getPhoneNr() {
		return this.fields().getOrDefault("phoneNr", null);
	}

	public void setPhoneNr(String phoneNr) {
		this.fields().put("phoneNr", phoneNr);
	}

	public String getPictureURL() {
		return this.fields().getOrDefault("pictureURL", null);
	}
	
	public void setPictureURL(String pictureURL) {
		this.fields().put("pictureURL", pictureURL);
	}

}
