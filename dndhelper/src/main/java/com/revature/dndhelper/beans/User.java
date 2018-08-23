package com.revature.dndhelper.beans;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="User_Accounts")
@JsonRootName(value = "user")
public class User implements Serializable{
	
	@Id
	@Column(name = "email")
	private String email;
	@Column(name = "pass")
	private String password;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}