package com.forever.springcloud.service.impl;

import com.forever.springcloud.dto.ResponseData;
import com.forever.springcloud.entity.Dept;
import com.forever.springcloud.mapper.DeptMapper;
import com.forever.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.21:02
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public ResponseData<Dept> getDeptById(Integer id) {
        return new ResponseData<Dept>().setData(deptMapper.selectById(id));
    }

    @Override
    public ResponseData<Dept> listDept() {
        return new ResponseData<Dept>().setRows(deptMapper.loadDept());
    }
}
