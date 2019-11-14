package com.games.GameSearchRestServer;


import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity



@Table (name = "Users")
 public @Data class User{


	@Id
	
	@Column(name="nickName")
	private String nickName;

	@Column(name = "Name")
	private String name;

	@Column(name = "surName")
	private String surName;

	@Column(name = "mail")
	private String mail;

	@Column(name = "password")
	private String password;

	@Column(name = "adress")
	private String adress;

	@Column(name="homelat")
	private double homeLat;

	@Column(name="homelong")
	private double homeLong;

	@Column(name = "birthday")
	private String birthday;
	
}
