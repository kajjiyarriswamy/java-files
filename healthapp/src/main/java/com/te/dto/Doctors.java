package com.te.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctors")
public class Doctors {
	@Id
	@Column(name = "DoctorsId")
	private int id;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "Specialist")
	private String specialistIn;
	@Column(name = "ContactNumber")
	private String contactNumber;
	@Column(name = "Password")
	private String password;

	public Doctors(int id, String firstName, String lastName, String specialistIn, String contactNumber,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialistIn = specialistIn;
		this.contactNumber = contactNumber;
		this.password = password;
	}

	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpecialistIn() {
		return specialistIn;
	}

	public void setSpecialistIn(String specialistIn) {
		this.specialistIn = specialistIn;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
