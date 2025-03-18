package com.example.dump.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "users")
@Getter
public class User {
	private Long idx;
	@Id
	private Long userId;
	private String name;
	private String email;
	private String password;
	private String role;
	private String profile;
	private String phone;
	private String address;
	private String nationality;
	private String addressDetail;
	private String postcode;
	private String birthdate;
	private String hobby;
	private String hobbyDetail;
}
