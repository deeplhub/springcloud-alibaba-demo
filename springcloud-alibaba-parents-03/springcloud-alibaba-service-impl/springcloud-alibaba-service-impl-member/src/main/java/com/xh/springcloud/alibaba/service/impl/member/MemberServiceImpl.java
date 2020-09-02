package com.xh.springcloud.alibaba.service.impl.member;

import com.xh.springcloud.alibaba.service.api.member.MemberService;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/9/2
 */
@RestController
public class MemberServiceImpl implements MemberService {

    @Override
    public String getUser(Integer userId) {
        return "我是会员服务";
    }
}
