package com.boom.dubbo.share.service;

import com.boom.dubbo.share.dto.MemberDTO;

/**
 * Created by jiangshan on 16/6/15.
 */
public interface HomePageService {
    MemberDTO getMemberById(String id);
}
