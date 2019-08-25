package com.web;
import com.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    HiService hiService;
    @RequestMapping("/hi")

    public String hi(String name){
        System.out.println("hhhehhehehe"+name);
        return hiService.hi(name);
    }

}
