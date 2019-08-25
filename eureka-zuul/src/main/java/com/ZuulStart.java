package com;

import com.filters.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulStart {
    public static void main(String[] args) {
        SpringApplication.run(ZuulStart.class,args);
    }

    @Bean
    public PreFilter zuulPreFilter() {
        return new PreFilter();
    }
}
