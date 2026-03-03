package com.rays.ctl;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.session.ManagerBase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ManagerDTO;
import com.rays.form.ManagerForm;
import com.rays.service.ManagerServiceInt;

@RestController
@RequestMapping(value = "Manager")
public class ManagerCtl extends BaseCtl<ManagerForm, ManagerDTO, ManagerServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		System.out.println("inside preload order");
		ORSResponse res = new ORSResponse(true);

		// Hardcoded Division List
		Map<String, String> map = new HashMap<>();
		map.put("Indore", "Indore");
		map.put("Ujjain", "Ujjain");
		

		res.addResult("managerList", map);

		return res;
	}


}
