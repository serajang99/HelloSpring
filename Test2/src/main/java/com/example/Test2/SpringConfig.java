package com.example.Test2;

import com.example.Test2.aop.TimeTraceAop;
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

    // AOP 같은 경우는 @Component를 쓰지 않고 Bean으로 등록해주는 편이 좋다
    // AOP 하는 애구나를 따로 구분하기 위함.
//    @Bean
//    public TimeTraceAop timeTraceApp() {
//        return new TimeTraceAop();
//    }
}
