package com.kumsal.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	
}
