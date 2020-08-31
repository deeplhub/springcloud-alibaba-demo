package com.xh.springcloud.alibaba.order.service;

import com.xh.springcloud.alibaba.order.loadbalancer.LoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/8/31
 */
@RestController
public class OrderService {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancer loadBalancer;

    /**
     * 订单服务调用到我们的会员服务接口
     *
     * @return
     */
    @RequestMapping("/orderToMember")
    public Object orderToMember() {
        // 1.根据服务名称从 注册中心获取集群列表地址
        List<ServiceInstance> instances =
                discoveryClient.getInstances("springcloud-alibaba-member");
        // 2.列表任意选择一个 实现本地rpc调用 rest 采用我们负载均衡的算法
        ServiceInstance srviceInstance = loadBalancer.getSingleAddres(instances);
        URI rpcMemberUrl = srviceInstance.getUri();
        String result = restTemplate.getForObject(rpcMemberUrl + "/getUser", String.class);
        return "订单调用会员返回结果:" + result;
    }

}
