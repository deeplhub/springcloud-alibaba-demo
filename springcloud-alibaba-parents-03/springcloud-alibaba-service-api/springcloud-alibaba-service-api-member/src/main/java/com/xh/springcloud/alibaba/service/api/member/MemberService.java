package com.xh.springcloud.alibaba.service.api.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/9/2
 */
public interface MemberService {

    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Integer userId);

}
