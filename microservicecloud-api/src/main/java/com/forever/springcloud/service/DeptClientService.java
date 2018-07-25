package com.forever.springcloud.service;

import com.forever.springcloud.dto.ResponseData;
import com.forever.springcloud.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-24.23:30
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
@RequestMapping("/dept")
public interface DeptClientService {

    @GetMapping("/{id}")
    ResponseData<Dept> getDeptById(@PathVariable("id") Integer id);

    @GetMapping("list")
    ResponseData<Dept> listDept();
}
