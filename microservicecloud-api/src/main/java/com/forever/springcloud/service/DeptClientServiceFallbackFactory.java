package com.forever.springcloud.service;

import com.forever.springcloud.dto.ResponseData;
import com.forever.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-25.22:22
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public ResponseData<Dept> getDeptById(Integer id) {
                return new ResponseData<>().set300Msg("服务关闭");
            }

            @Override
            public ResponseData<Dept> listDept() {
                return null;
            }
        };
    }
}
