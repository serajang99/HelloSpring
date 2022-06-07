package com.example.Test2;

import com.example.Test2.repository.MemberRepository;
import com.example.Test2.repository.MemoryMemberRepository;
import com.example.Test2.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
