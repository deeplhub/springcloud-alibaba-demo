package com.xh.springcloud.alibaba.order.loadbalancer;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Title: 负载均衡器算法
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/8/31
 */
public interface LoadBalancer {
    /**
     * 从注册中心集群列表中获取单个地址
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance getSingleAddres(List<ServiceInstance> serviceInstances);

}
