package com.rays.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;


@Entity
@Table(name = "ST_STAFF_MEMBER")
public class StaffMemberDTO extends BaseDTO {

	@Column(name = "FULL_NAME", length = 100)
	private String fullName;

	@Column(name = "JOINING_DATE")
	private LocalDate joiningDate;

	@Column(name = "DIVISION", length = 50)
	private String division;

	@Column(name = "PREVIOUS_EMPLOYER", length = 100)
	private String previousEmployer;

	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getPreviousEmployer() {
		return previousEmployer;
	}

	public void setPreviousEmployer(String previousEmployer) {
		this.previousEmployer = previousEmployer;
	}

	@Override
	public String getKey() {
		return id + "";
	}

	@Override
	public String getValue() {
		return fullName;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("fullName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("fullName", fullName);
		return map;
	}

	@Override
	public String getUniqueKey() {
		return "fullName";
	}

	@Override
	public String getUniqueValue() {
		return fullName + "";
	}

	@Override
	public String getLabel() {
		return "Full Name";
	}

}