package com.app.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ROLE")
@Data
public class Role {

	@Id
	@SequenceGenerator(name = "ROLE_ID_SEQ_GEN", sequenceName = "ROLE_ID_SEQ")
	@GeneratedValue(generator = "ROLE_ID_SEQ_GEN", strategy = GenerationType.AUTO)
	private Integer role_id;
	private String role;
}
