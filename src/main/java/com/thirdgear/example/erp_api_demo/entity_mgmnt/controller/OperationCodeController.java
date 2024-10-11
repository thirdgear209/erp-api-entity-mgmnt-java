package com.thirdgear.example.erp_api_demo.entity_mgmnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdgear.example.erp_api_demo.entity.OperationCode;
import com.thirdgear.example.erp_api_demo.entity.Tank;
import com.thirdgear.example.erp_api_demo.entity_mgmnt.service.OperationCodeMgmntService;
import com.thirdgear.example.erp_api_demo.service.TankManagementService;

@RestController
@RequestMapping("/operationCode")
public class OperationCodeController {
	

    @Autowired
    OperationCodeMgmntService opCodeService;

    @GetMapping
    public Iterable<OperationCode> getOperationCodes(){
    	
    	Iterable<OperationCode> opCodes  = opCodeService.listOperationCodes();
    	
        return opCodes;
    } 
    
    @PostMapping    
    public Tank post(OperationCode opCode){
    	opCodeService.createOperationCode(opCode);
    }

    @PutMapping
    public Tank put(OperationCode opCode){
    	opCodeService.updateOperationCode(opCode);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
    	opCodeService.archiveOperationCode(id);
    }
    
}
