package com.thirdgear.example.erp_api_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.entity.OperationCode;
import com.thirdgear.example.erp_api_demo.repo.OperationCodeRepository;
import com.thirdgear.example.erp_api_demo.service.OperationCodeService;

public class OperationCodeServiceImpl implements OperationCodeService {

    @Autowired
    OperationCodeRepository repo;

    @Override
    public Iterable<OperationCode> getOperationCodes() {
        return repo.findAll();
    }
}