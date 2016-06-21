package com.boom.dubbo.provider.local.impl;

import com.boom.dubbo.provider.local.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public String findMemberByUid(String uid) throws Exception {
        return "Hello World";
    }
}
