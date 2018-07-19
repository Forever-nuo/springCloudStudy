package com.forever.springcloud.controller;

import com.forever.springcloud.dto.ResponseData;
import com.forever.springcloud.entity.Dept;
import com.forever.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.20:58
 */
@RequestMapping("dept")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/{id}")
    public ResponseData<Dept> getDeptById(@PathVariable Integer id) {
        return deptService.getDeptById(id);
    }

    @GetMapping("/list")
    public ResponseData<Dept> listDept() {
        return deptService.listDept();
    }


}
