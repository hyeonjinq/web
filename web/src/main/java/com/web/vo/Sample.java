package com.web.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Sample {

	@Id
	@GeneratedValue
	private int id;

	private String email;

	private String password;

}