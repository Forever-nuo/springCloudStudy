package com.forever.springcloud.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.forever.springcloud.entity.Dept;

import java.util.List;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.21:05
 */
public interface DeptMapper extends BaseMapper<Dept> {

    List<Dept> loadDept();
}
