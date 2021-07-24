package com.psp.dtomapper.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Student(Long id, String studentName, String rollNumber) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}

	public Student(String studentName, String rollNumber) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", rollNumber=" + rollNumber + "]";
	}

}
