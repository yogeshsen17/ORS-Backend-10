package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ManagerDTO;

public class ManagerForm extends BaseForm{
	
	@NotEmpty(message= "please enter Manager Name")
	private String managerName;
	
	@NotEmpty(message= "please enter Branch Name")
	private String branchName;
	
	
	@NotNull(message= "please enter Contact Number")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String contactNumber;

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
	@Override
	public BaseDTO getDto() {

	ManagerDTO dto = initDTO(new ManagerDTO());
	dto.setManagerName(managerName);
	dto.setBranchName(branchName);
	dto.setContactNumber(contactNumber);
	
	
	return dto;
	}





}
