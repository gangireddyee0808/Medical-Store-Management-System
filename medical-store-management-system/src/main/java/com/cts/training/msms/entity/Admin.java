package com.cts.training.msms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Admin")
@Entity
public class Admin {
	
	@Id
	@Column(name = "Admin_id")
	private Integer id;
	
	@Column(name = "UserName")
	private String username;
	
	@Column(name = "Password")
	private String password;

	public Admin() {
		super();
	}

	public Admin(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
