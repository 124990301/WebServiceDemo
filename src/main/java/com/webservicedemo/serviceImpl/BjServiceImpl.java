package com.webservicedemo.serviceImpl;

import com.webservicedemo.service.BjService;

import javax.jws.WebService;

@WebService(targetNamespace="http://service.webservicedemo.com/",endpointInterface = "com.webservicedemo.service.BjService")
public class BjServiceImpl implements BjService {

    @Override
    public String getBjxx(String name) {
        return "haha"+name;
    }
}
