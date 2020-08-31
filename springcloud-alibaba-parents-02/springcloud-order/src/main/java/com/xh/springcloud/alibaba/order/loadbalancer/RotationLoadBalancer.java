package com.xh.springcloud.alibaba.order.loadbalancer;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/8/31
 */
@Component
public class RotationLoadBalancer implements LoadBalancer {
    /**
     * 从0开始计数
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);


    @Override
    public ServiceInstance getSingleAddres(List<ServiceInstance> serviceInstances) {
        int index = atomicInteger.incrementAndGet() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
