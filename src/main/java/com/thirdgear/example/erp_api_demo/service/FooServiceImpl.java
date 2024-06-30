package com.thirdgear.example.erp_api_demo.service;

import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService{
	public void doFoo() {
		System.out.println("Foo!");
	}
}
