package com.webservicedemo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface BjService {

    @WebMethod
    public String getBjxx(@WebParam(name = "name") String name);
}
