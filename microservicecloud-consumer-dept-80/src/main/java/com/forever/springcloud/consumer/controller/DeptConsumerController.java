package com.forever.springcloud.consumer.controller;

import com.forever.springcloud.dto.ResponseData;
import com.forever.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.23:04
 */
@RequestMapping("consumer/dept")
@RestController
public class DeptConsumerController {

    public static final  String PROVIDER_PREFIX_PATH = "http://localhost:8001/dept";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public ResponseData<Dept> getDeptById(@PathVariable Integer id){
      return restTemplate.getForObject(PROVIDER_PREFIX_PATH+"/"+id,ResponseData.class);
    }

}
