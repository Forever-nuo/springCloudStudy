package com.forever.springcloud.controller;

import com.forever.springcloud.dto.ResponseData;
import com.forever.springcloud.entity.Dept;
import com.forever.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.20:58
 */
@RequestMapping("/dept")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/{id}")
    public ResponseData<Dept> getDeptById(@PathVariable Integer id) {
        return deptService.getDeptById(id);
    }

    @GetMapping("/list")
    public ResponseData<Dept> listDept() {
        return deptService.listDept();
    }

    @GetMapping("/discovery")
    public ResponseData discovery(){

        List<String> services = client.getServices();
        System.out.println(services);

        List<Map> resultMapList = new ArrayList<>();
        for (String service : services) {
            List<ServiceInstance> instances = client.getInstances(service);
            for (ServiceInstance instance : instances) {
                Map resultMap = new LinkedHashMap();
                resultMap.put("host",instance.getHost());
                /**
                 * public interface ServiceInstance {
                 *     String getServiceId();
                 *
                 *     String getHost();
                 *
                 *     int getPort();
                 *
                 *     boolean isSecure();
                 *
                 *     URI getUri();
                 *
                 *     Map<String, String> getMetadata();
                 *
                 *     default String getScheme() {
                 *         return null;
                 *     }
                 * }
                 */
                resultMapList.add(resultMap);
            }
        }

        return  new ResponseData().setRows(resultMapList);

    }

}
