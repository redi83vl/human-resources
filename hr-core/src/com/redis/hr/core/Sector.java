/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.hr.core;

import java.util.Objects;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class Sector {
	private final String code;
	private final String name;
	private String phone, email, address;

	public Sector(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public Sector(String code, String name, String phone, String email, String address) {
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(this.code);
		hash = 31 * hash + Objects.hashCode(this.name);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Sector other = (Sector) obj;
		return Objects.equals(this.code, other.code);
	}
	
	
}
