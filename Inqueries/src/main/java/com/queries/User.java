package com.queries;

public class User {
    
	 private int id;
	 private String username;  // New field
	 private String email;     // New field
	 private String queryCategory; 
     private String queryText; 
     private String submittedAt; 
     private String respondedAt; 
     private String responseText;
    
	public User(int id, String username, String email, String queryCategory, String queryText, String submittedAt, String respondedAt, String responseText) {
		this.id = id;
		this.username = username;   // New field initialization
		this.email = email;         // New field initialization
		this.queryCategory = queryCategory;
		this.queryText = queryText;
		this.submittedAt = submittedAt;
		this.respondedAt = respondedAt;
		this.responseText = responseText;
	}

	// Getters and Setters for all fields, including new ones

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {    // New getter
		return username;
	}

	public void setUsername(String username) {   // New setter
		this.username = username;
	}

	public String getEmail() {   // New getter
		return email;
	}

	public void setEmail(String email) {   // New setter
		this.email = email;
	}

	public String getQueryCategory() {
		return queryCategory;
	}

	public void setQueryCategory(String queryCategory) {
		this.queryCategory = queryCategory;
	}

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public String getSubmittedAt() {
		return submittedAt;
	}

	public void setSubmittedAt(String submittedAt) {
		this.submittedAt = submittedAt;
	}

	public String getRespondedAt() {
		return respondedAt;
	}

	public void setRespondedAt(String respondedAt) {
		this.respondedAt = respondedAt;
	}

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}
}
