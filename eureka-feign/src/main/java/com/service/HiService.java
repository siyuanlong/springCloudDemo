package com.service;

import com.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    EurekaClientFeign clientFeign;

    public String hi(String name){
        System.out.println("============daoci"+name);
        return clientFeign.hi(name);
    }
}
