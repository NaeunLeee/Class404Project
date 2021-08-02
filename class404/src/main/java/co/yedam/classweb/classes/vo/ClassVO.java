package co.yedam.classweb.classes.vo;

import java.sql.Date;

public class ClassVO {
	
	private int clId;
	private String clName;
	private String clTeacher;
	private Date clDate;
	private String clPlace;
	private int clMax;
	private int clStudent;
	private String clDetail;
	
	
	public ClassVO() {}


	public int getClId() {
		return clId;
	}


	public void setClId(int clId) {
		this.clId = clId;
	}


	public String getClName() {
		return clName;
	}


	public void setClName(String clName) {
		this.clName = clName;
	}


	public String getClTeacher() {
		return clTeacher;
	}


	public void setClTeacher(String clTeacher) {
		this.clTeacher = clTeacher;
	}


	public Date getClDate() {
		return clDate;
	}


	public void setClDate(Date clDate) {
		this.clDate = clDate;
	}


	public String getClPlace() {
		return clPlace;
	}


	public void setClPlace(String clPlace) {
		this.clPlace = clPlace;
	}


	public int getClMax() {
		return clMax;
	}


	public void setClMax(int clMax) {
		this.clMax = clMax;
	}


	public int getClStudent() {
		return clStudent;
	}


	public void setClStudent(int clStudent) {
		this.clStudent = clStudent;
	}


	public String getClDetail() {
		return clDetail;
	}


	public void setClDetail(String clDetail) {
		this.clDetail = clDetail;
	}
	
	
	
}
