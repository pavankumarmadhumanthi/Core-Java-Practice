package com.user;

public class User {
	private int userid;
	private String username;
	private String useremail;
	private int userphno;
	
	
	public User(String username, String useremail, int userphno) {
		super();
		this.username = username;
		this.useremail = useremail;
		this.userphno = userphno;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public int getUserphno() {
		return userphno;
	}
	public void setUserphno( int userphno2) {
		this.userphno = userphno2;
	}

}
