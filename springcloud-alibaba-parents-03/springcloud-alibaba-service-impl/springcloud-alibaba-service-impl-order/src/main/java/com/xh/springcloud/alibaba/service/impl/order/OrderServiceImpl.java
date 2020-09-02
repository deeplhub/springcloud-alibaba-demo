package com.xh.springcloud.alibaba.service.impl.order;

import com.xh.springcloud.alibaba.service.impl.openfeign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/9/3
 */
@RestController
public class OrderServiceImpl {

    @Autowired
    private MemberServiceFeign memberServiceFeign;

    /**
     * 基于我们的fegin客户端形式实现rpc远程调用
     *
     * @return
     */
    @RequestMapping("/orderFeignToMember")
    public String orderFeignToMember() {
        String result = memberServiceFeign.getUser(1);
        return "我是订单服务调用会员服务的接口,返回结果" + result;
    }
}
