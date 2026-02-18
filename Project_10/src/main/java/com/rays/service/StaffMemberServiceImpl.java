package com.rays.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.StaffMemberDAOInt;
import com.rays.dto.StaffMemberDTO;


@Service
@Transactional
public class StaffMemberServiceImpl extends BaseServiceImpl<StaffMemberDTO, StaffMemberDAOInt> implements StaffMemberServiceInt {


}