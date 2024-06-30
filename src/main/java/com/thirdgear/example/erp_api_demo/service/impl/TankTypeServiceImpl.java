package com.thirdgear.example.erp_api_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.entity.TankType;
import com.thirdgear.example.erp_api_demo.repo.TankTypeRepository;
import com.thirdgear.example.erp_api_demo.service.TankTypeService;

public class TankTypeServiceImpl implements TankTypeService{

	@Autowired 
	private TankTypeRepository repo;
	
	@Override
	public Iterable<TankType> getTankTypes() {
		return repo.findAll();
	}
	
}