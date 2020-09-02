package com.xh.springcloud.alibaba.service.impl.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/9/3
 */
@FeignClient("springcloud-alibaba-member")
public interface MemberServiceFeign {

    @GetMapping("/getUser")
    public String getUser(@RequestParam("userId") Integer userId);
}
