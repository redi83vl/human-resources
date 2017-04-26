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
public class IdDocument {
	private final Person owner;
	private final String type;
	private final String number;
	private final Date issue;
	private final Date expiry;

	public IdDocument(Person owner, String type, String docnum, Date issueDate, Date expiryDate) {
		this.owner = owner;
		this.type = type;
		this.number = docnum;
		this.issue = issueDate;
		this.expiry = expiryDate;
	}

	public Person getOwner() {
		return owner;
	}

	public String getType() {
		return type;
	}

	public String getNumber() {
		return number;
	}

	public Date getIssue() {
		return issue;
	}

	public Date getExpiry() {
		return expiry;
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
		final IdDocument other = (IdDocument) obj;
		if (!Objects.equals(this.type, other.type)) {
			return false;
		}
		if (!Objects.equals(this.number, other.number)) {
			return false;
		}
		return Objects.equals(this.owner, other.owner);
	}
	
	
}
