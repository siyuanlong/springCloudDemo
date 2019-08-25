package com.feign;
import com.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-client",configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @RequestMapping (value = "hi")
    String hi(@RequestParam(value = "name") String name);
}
