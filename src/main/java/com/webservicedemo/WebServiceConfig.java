package com.webservicedemo;

import com.webservicedemo.service.BjService;
import com.webservicedemo.service.UserService;
import com.webservicedemo.serviceImpl.BjServiceImpl;
import com.webservicedemo.serviceImpl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean dispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/service/*");//发布服务名称
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus()
    {
        return  new SpringBus();
    }

    @Bean
    public UserService userService()
    {
        return  new UserServiceImpl();
    }


    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint=new EndpointImpl(springBus(), userService());//绑定要发布的服务
        endpoint.publish("/user"); //显示要发布的名称
        return endpoint;
    }

    @Bean
    public BjService bjService()
    {
        return  new BjServiceImpl();
    }

    @Bean
    public Endpoint endpoint2() {
        EndpointImpl endpoint=new EndpointImpl(springBus(), bjService());//绑定要发布的服务
        endpoint.publish("/bj"); //显示要发布的名称
        return endpoint;
    }

}