package com.xh.springcloud.alibaba.member.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/8/31
 */
@RestController
public class MemberService {

    @Value("${server.port}")
    private String serverPort;

    /**
     * 会员服务提供的接口被订单服务调用
     *
     * @return
     */
    @GetMapping("/getUser")
    public String getUser() {

        return "当前端口号为:" + serverPort;
    }
}
