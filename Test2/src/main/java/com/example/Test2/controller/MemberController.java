package com.example.Test2.controller;

import com.example.Test2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //Controller를 생성했을때 Spring Bean을 통해서 Service를 찾아서 자동으로 연결해준다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
