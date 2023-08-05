package main.java.hello.demo.service;

import hello.hellospring.service.MemberService;
import hello.hellospring.service.MemberRepository;
import hello.hellospring.service.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService();
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
