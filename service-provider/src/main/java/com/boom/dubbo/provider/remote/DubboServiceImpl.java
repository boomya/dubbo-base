package com.boom.dubbo.provider.remote;

import com.boom.dubbo.provider.local.MemberService;
import com.boom.dubbo.share.dto.MemberDTO;
import com.boom.dubbo.share.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jiangshan on 16/6/16.
 */
public class DubboServiceImpl implements HomePageService {

    @Autowired
    private MemberService memberService;

    @Override
    public MemberDTO getMemberById(String id) {
        MemberDTO memberDTO = new MemberDTO();
//        memberDTO.setId("100");
//        memberDTO.setName("test");

        try {
            String member = memberService.findMemberByUid(id);
            memberDTO.setName(member);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return memberDTO;
    }
}
