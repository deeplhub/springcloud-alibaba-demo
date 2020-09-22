package com.xh.springcloud.alibaba.config.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/9/7
 */
@RestController
@SpringBootApplication
@RefreshScope
public class NacosConfigController {

    @Value("${springcloud.name}")
    private String userName;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return userName;
    }

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigController.class);
    }
}
