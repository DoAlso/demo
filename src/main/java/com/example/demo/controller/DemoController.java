package com.example.demo.controller;

import com.example.demo.consumer.StringRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author Administrator
 * @DATE 2019/2/16 13:34
 */
@RestController
public class DemoController {
    @Autowired
    private StringRestClient stringRestClient;

    @GetMapping("/sayHi")
    public String sayHello(String name){
        return "Hello "+name;
    }

    @GetMapping("/getStrIn")
    public String getStrIn(){
        return stringRestClient.getStrIn();
    }
}
