package com.softdive.timesheet.model;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private long id;
	private String name;
	private String mobile;
	private Collection<RoleType> unverifiedRoles;
	private Collection<RoleType> verifiedRoles;
	private Collection<RoleType> allRoles;

	public Collection<RoleType> getUnverifiedRoles() {
		return unverifiedRoles;
	}

	public void setUnverifiedRoles(Collection<RoleType> unverifiedRoles) {
		this.unverifiedRoles = unverifiedRoles;
	}

	public Collection<RoleType> getVerifiedRoles() {
		return verifiedRoles;
	}

	public void setVerifiedRoles(Collection<RoleType> verifiedRoles) {
		this.verifiedRoles = verifiedRoles;
	}

	public Collection<RoleType> getAllRoles() {
		return allRoles;
	}

	public void setAllRoles(Collection<RoleType> allRoles) {
		this.allRoles = allRoles;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
