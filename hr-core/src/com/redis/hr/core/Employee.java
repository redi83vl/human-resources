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
public class Employee extends Person{
	private final Sector sector;
	private final String role;
	private Date startDate;
	private Date endDate;
	private String phone, email, address;
	
	public Employee(
		String id, 
		String fname, String mname, String lname,
		Date bdate, String bplace,
		String phone, String email, String address, 
		Sector sector, String role, Date startDate, Date endDate
	) {
		super(id, fname, mname, lname, bdate, bplace, phone, email, address);
		this.sector = sector;
		this.role = role;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Sector getSector() {
		return sector;
	}

	public String getRole() {
		return role;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
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

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
		final Employee other = (Employee) obj;
		if (!Objects.equals(this.role, other.role)) {
			return false;
		}
		if (!Objects.equals(this.sector, other.sector)) {
			return false;
		}
		if (!Objects.equals(this.startDate, other.startDate)) {
			return false;
		}
		return super.equals(obj) && Objects.equals(this.endDate, other.endDate);
	}
}
