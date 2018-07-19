package com.forever.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-18.22:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept {
    private Integer id;   //主键
    private String deptName; //部门名称
    private String dbSource; //来自哪个数据库
}
