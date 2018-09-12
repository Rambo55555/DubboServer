package com.rambo.dubbotest.service.impl;

import org.springframework.stereotype.Component;

import com.rambo.dubbotest.service.DubboServiceProvider;

@Component("dubboServiceProvider")
public class DubboServiceProviderImpl implements DubboServiceProvider {

	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello, " + name;
	}

}
