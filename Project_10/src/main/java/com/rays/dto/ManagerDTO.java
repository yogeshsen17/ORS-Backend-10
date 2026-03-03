package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_MANAGER")
public class ManagerDTO extends BaseDTO{
	
	@Column(name = "MANAGER_NAME", length = 50)
	private String managerName;
	
	@Column(name = "BRANCH_NAME", length = 50)
	private String branchName;
	
	@Column(name = "CONTACT_NUMBER", length = 10)
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

	public String getKey() {
		return id + "";
	}

	public String getValue() {
		return managerName;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("managerName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("managerName", managerName);
		return map;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "managerName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return managerName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "managerName";
	}

}
