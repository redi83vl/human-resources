/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redis.hr.core;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Redjan Shabani info@redis.com.al
 */
public class Person {
	private final String id;
	private final String fname, mname, lname;
	private final Date bdate;
	private final String bplace;
	private String phone, email, address;

	public Person(String id, String fname, String mname, String lname, Date bdate, String bplace, String phone, String email, String address) {
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.bdate = bdate;
		this.bplace = bplace;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
	}

	public Date getBdate() {
		return bdate;
	}

	public String getBplace() {
		return bplace;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(this.fname);
		hash = 31 * hash + Objects.hashCode(this.mname);
		hash = 31 * hash + Objects.hashCode(this.lname);
		hash = 31 * hash + Objects.hashCode(this.bdate);
		hash = 31 * hash + Objects.hashCode(this.bplace);
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
		final Person other = (Person) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
	}
	
}
