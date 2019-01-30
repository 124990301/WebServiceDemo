package com.webservicedemo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private static final long serialVersionUID = -5939599230753662529L;
    private String            userId;
    private String            name;
    private Integer            age;
    private Date              updateTime;
    //getter setter ......
    public void setUserId(String userId) {
        this.userId=userId;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime=updateTime;
    }


    public String getUserId() {
        return userId;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}