package com.revature.beans;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserAccount implements Serializable{
	@Id
	@Column(name = "email")
	private String email;
	@Column(name = "pass")
	private String password;
	public UserAccount(String email,String password) {
		this.email = email;
		this.password = password;
	}
	public void setPword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public String getPword() {
		return password;
	}
}