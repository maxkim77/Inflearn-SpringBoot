package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@Configuration
	public static class SpringConfig {

		@Bean
		public MemberService memberService() {
			return new MemberService(memberRepository());
		}

		@Bean
		public MemberRepository memberRepository() {
			// 여기에 적절한 MemberRepository 구현체를 반환하도록 구현
			return new MemoryMemberRepository();
		}
	}
}
