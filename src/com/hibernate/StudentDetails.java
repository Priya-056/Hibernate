package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity

@Table(name="Student Table")
public class StudentDetails {
	@Id
	@Column(name="Student ID")
	private int stdid;
	@Column(name="Student Name")
	private String stdname;
	@Column(name="Student Mark")
	private int stdmarks;
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdmarks() {
		return stdmarks;
	}
	public void setStdmarks(int stdmarks) {
		this.stdmarks = stdmarks;
	}
	@Override
	public String toString() {
		return "StudentDetails [stdid=" + stdid + ", stdname=" + stdname + ", stdmarks=" + stdmarks + "]";
	}
	public StudentDetails(int stdid, String stdname, int stdmarks) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmarks = stdmarks;
	}
	
	
	
}
