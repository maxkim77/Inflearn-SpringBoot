package main.java.hello.demo.service;

import main.java.hello.demo.domain.Member;
import main.java.hello.demo.repository.MemberRepository;
import main.java.hello.demo.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Autowired
    public MemberService(MemberRepository memeberRepository){
        this.memberRepository = memberRepository;

    }
    public Long join(Membermember){
        validateDuplicateMember(member);
        memberRepository.save(member);
        return memeber.getId();
    }
    private void validateDuplicateMember(Member member){
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }
    public List<Member> findMember(){
        return memberRepository.findAll();

    }
    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
