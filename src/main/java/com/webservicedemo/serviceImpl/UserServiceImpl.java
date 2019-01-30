package com.webservicedemo.serviceImpl;

import com.webservicedemo.User;
import com.webservicedemo.service.UserService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;



import javax.jws.WebService;


@WebService(targetNamespace="http://service.webservicedemo.com/",endpointInterface = "com.webservicedemo.service.UserService")
public class UserServiceImpl implements UserService {

    @Override
    public User getName(String name,Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }


}
