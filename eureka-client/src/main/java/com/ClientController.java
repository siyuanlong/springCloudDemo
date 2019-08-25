package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
    @RequestMapping("/clienttest")
    public String clienttest(){
        return "client test success";
    }

    @RequestMapping("/hi")
    public String hi(String name) throws Exception {
        System.out.println("-------------------"+name);
        System.out.println(1/0);
        return "hehehehehhe";
    }

    @RequestMapping("/rest")
    public String rest(){
        RestTemplate template = new RestTemplate();
        return template.getForObject("http://www.baidu.com",String.class);
    }
}
