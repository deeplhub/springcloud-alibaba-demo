package com.xh.springcloud.alibaba.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.UUID;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/9/3
 */
@SpringBootApplication
@EnableFeignClients
public class AppOrderSpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(AppOrderSpringBoot.class, args);
    }
}

