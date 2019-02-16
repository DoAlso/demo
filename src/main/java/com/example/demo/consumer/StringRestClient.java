package com.example.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName StringRestClient
 * @Description TODO
 * @Author Administrator
 * @DATE 2019/2/16 14:01
 */
@Component
public class StringRestClient {
    @Autowired
    private RestTemplate restTemplate;

    public String getStrIn(){
        return restTemplate.getForEntity("http://provider/getStrIn",String.class).getBody();
    }
}
