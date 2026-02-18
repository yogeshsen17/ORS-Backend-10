package com.rays.form;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.StaffMemberDTO;

/**
 * Contains StaffMember form elements and their declarative input validations.
 * 
 * Yogesh Sen 
 */
public class StaffMemberForm extends BaseForm {

	

	@NotEmpty(message = "Please enter full name")
	private String fullName;

	@NotNull(message = "Please enter joining date")
	private LocalDate joiningDate;

	@NotEmpty(message = "Please select division")
	private String division;

	@NotEmpty(message = "Please enter previous employer")
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
	public BaseDTO getDto() {
		StaffMemberDTO dto = initDTO(new StaffMemberDTO());
		dto.setFullName(fullName);
		dto.setJoiningDate(joiningDate);
		dto.setDivision(division);
		dto.setPreviousEmployer(previousEmployer);
		return dto;
	}

}