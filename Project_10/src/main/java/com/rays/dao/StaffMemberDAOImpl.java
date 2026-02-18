package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.StaffMemberDTO;


@Repository
public class StaffMemberDAOImpl extends BaseDAOImpl<StaffMemberDTO> implements StaffMemberDAOInt {

	@Override
	public Class<StaffMemberDTO> getDTOClass() {
		return StaffMemberDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(StaffMemberDTO dto, CriteriaBuilder builder, Root<StaffMemberDTO> qRoot) {

		// Create where conditions
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		
		if (!isEmptyString(dto.getFullName())) {
			whereCondition.add(builder.like(qRoot.get("fullName"), dto.getFullName() + "%"));
		}

		if (isNotNull(dto.getJoiningDate())) {
			whereCondition.add(builder.equal(qRoot.get("joiningDate"), dto.getJoiningDate()));
		}

		if (!isEmptyString(dto.getDivision())) {
			whereCondition.add(builder.equal(qRoot.get("division"), dto.getDivision()));
		}

		if (!isEmptyString(dto.getPreviousEmployer())) {
			whereCondition.add(builder.like(qRoot.get("previousEmployer"), dto.getPreviousEmployer() + "%"));
		}

		return whereCondition;
	}

	@Override
	protected void populate(StaffMemberDTO dto, UserContext userContext) {
		// No foreign key relations to populate
	}

}