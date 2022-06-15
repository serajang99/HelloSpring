package com.example.Test2.service;

import com.example.Test2.domain.Member;
import com.example.Test2.repository.MemberRepository;
import com.example.Test2.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /* 회원가입 */
    public Long join(Member member) {

//        long start = System.currentTimeMillis();

        // ctrl + alt + v: variable 추출하기
//        Optional<Member> result = memberRepository.findByName(member.getName());
//        result.ifPresent(m -> {
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        });

        // ctrl + alt + m: method 추출하기
        validateDuplicateMember(member); // 중복 회원 검증

        memberRepository.save(member);
        return member.getId();

//        try{
//
//        } finally {
//            long finish = System.currentTimeMillis();
//            long timeMs = finish-start;
//            System.out.println("join = "+timeMs+"ms");
//        }


    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /* 전체 회원 조회 */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
