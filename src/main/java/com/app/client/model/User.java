package com.app.client.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "USERS")
@Data
public class User {
	
	@Id
	@SequenceGenerator(name = "USER_ID_SEQ_GEN", sequenceName = "USER_ID_SEQ")
	@GeneratedValue(generator = "USER_ID_SEQ_GEN", strategy = GenerationType.AUTO)
	private Integer user_id;

	private String email;
	 
	private String firstname; 
	 
	private String lastname;
	 
	private String password;
	 
	private int active;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role> roles;
}
