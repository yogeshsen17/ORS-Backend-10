package com.rays.ctl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.StaffMemberDTO;
import com.rays.form.StaffMemberForm;
import com.rays.service.StaffMemberServiceInt;


@RestController
@RequestMapping(value = "StaffMember")
public class StaffMemberCtl extends BaseCtl<StaffMemberForm, StaffMemberDTO, StaffMemberServiceInt> {

	/**
	 * Preload method to load Division dropdown list
	 */
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload StaffMember");
		ORSResponse res = new ORSResponse(true);
		
		// Hardcoded Division List
		Map<String, String> divisionMap = new HashMap<>();
		divisionMap.put("IT", "IT");
		divisionMap.put("HR", "HR");
		divisionMap.put("Finance", "Finance");
		
		
		
		res.addResult("divisionList", divisionMap);
		
		return res;
	}

}