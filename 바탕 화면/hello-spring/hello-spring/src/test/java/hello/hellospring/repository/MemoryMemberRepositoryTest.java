package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();
    private Member member; // 'memeber'를 'member'로 수정
    private MemberService memberService;
    private MemoryMemberRepository memberRepository;


    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }




    @Test
    public void save() {
        member = new Member(); // 'memeber'를 'member'로 수정
        member.setName("spring"); // 'setname'을 'setName'으로 수정
        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findById() {
        Member member = new Member();
        member.setName("spring");
        repository.save(member);

        try {
            Member result = repository.findById(member.getId()).get();
            assertEquals(member, result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findByName() {
        Member member = new Member();
        member.setName("spring1");
        repository.save(member);

        try {
            Member result = repository.findByName("spring1").get();
            assertEquals(member, result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
