package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ManagerDTO;

@Repository
public class ManagerDAOImpl extends BaseDAOImpl<ManagerDTO> implements ManagerDAOInt{

	@Override
	protected List<Predicate> getWhereClause(ManagerDTO dto, CriteriaBuilder builder, Root<ManagerDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getManagerName())) {
			whereCondition.add(builder.like(qRoot.get("managerName"), dto.getManagerName() + "%"));
		}

		
		if (!isEmptyString(dto.getBranchName())) {
			whereCondition.add(builder.like(qRoot.get("branchName"), dto.getBranchName() + "%"));
		}
		if (!isEmptyString(dto.getContactNumber())) {
			whereCondition.add(builder.like(qRoot.get("contactNumber"), dto.getContactNumber() + "%"));
		}
		
		System.out.println("yes iam heariiiiii");

		return whereCondition;
	}

	@Override
	public Class<ManagerDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ManagerDTO.class;
	}

}
