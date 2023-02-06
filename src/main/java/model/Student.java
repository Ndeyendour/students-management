package model;

import java.time.LocalDate;

public class Student {
	private long studentId;
	private String firstname;
	private String lastname;
	private LocalDate dateOfBirth;
	private String trainingDuration;
	private LocalDate registrationDate;
	private boolean status;
	
	
	
	
	
	
	public Student(String firstname, String lastname, LocalDate dateOfBirth, LocalDate registrationDate,
			boolean status) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.registrationDate = registrationDate;
		this.status = status;
	}
	
	
	
	

	

	public Student() {
		super();
	}







	public Student(String firstname) {
		super();
		this.firstname = firstname;
	}







	public Student(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFirstname() {
		return firstname;
	}
	
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getTrainingDuration() {
		return trainingDuration;
	}
	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", dateOfBirth=" + dateOfBirth + ", trainingDuration=" + trainingDuration + ", registrationDate="
				+ registrationDate + "]";
	}
	
	

}
