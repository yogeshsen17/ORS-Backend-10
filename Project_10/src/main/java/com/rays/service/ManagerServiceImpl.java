package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ManagerDAOInt;
import com.rays.dto.ManagerDTO;

@Service
public class ManagerServiceImpl extends BaseServiceImpl<ManagerDTO, ManagerDAOInt> implements ManagerServiceInt{

}
