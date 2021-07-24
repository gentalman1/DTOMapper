package com.psp.dtomapper.dto;

public class StudentDTO {
	private Long id;
	private String studentName;
	private String rollNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public StudentDTO(String studentName, String rollNumber) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}

	public StudentDTO(Long id, String studentName, String rollNumber) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", studentName=" + studentName + ", rollNumber=" + rollNumber + "]";
	}

}
