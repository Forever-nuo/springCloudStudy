package com.forever.springcloud.service;

import com.forever.springcloud.dto.ResponseData;
import com.forever.springcloud.entity.Dept;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.21:02
 */
public interface DeptService {
    ResponseData<Dept> getDeptById(Integer id);

    ResponseData<Dept> listDept();
}
