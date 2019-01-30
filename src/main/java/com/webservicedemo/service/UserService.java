package com.webservicedemo.service;

import com.webservicedemo.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface UserService {

    @WebMethod
    User getName(@WebParam(name = "name") String name,@WebParam(name = "age") Integer age);
}