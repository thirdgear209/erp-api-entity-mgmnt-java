package com.thirdgear.example.erp_api_demo.repo;


import org.springframework.data.repository.CrudRepository;

import com.thirdgear.example.erp_api_demo.entity.OperationCode;


public interface OperationCodeRepository extends CrudRepository<OperationCode, Long>{
	
}