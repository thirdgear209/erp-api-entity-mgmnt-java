package com.thirdgear.example.erp_api_demo.entity_mgmnt.service;

import com.thirdgear.example.erp_api_demo.entity.OperationCode;
import com.thirdgear.example.erp_api_demo.entity.Tank;

public interface OperationCodeMgmntService {

	public Iterable<OperationCode>listOperationCodes();
	
	/**
	 * 
	 * @param tank
	 * @return
	 */
	public Tank createOperationCode(OperationCode operationCode);
	
	/**
	 * 
	 */
	public Tank updateOperationCode(OperationCode operationCode);
	
	/**
	 * 
	 */
	public void archiveOperationCode(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Tank getById(int id);
	
}
