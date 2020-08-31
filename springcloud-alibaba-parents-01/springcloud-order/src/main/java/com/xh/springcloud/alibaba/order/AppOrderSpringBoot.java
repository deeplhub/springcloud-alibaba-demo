package com.xh.springcloud.alibaba.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/8/31
 */
@SpringBootApplication
public class AppOrderSpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(AppOrderSpringBoot.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}