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
<<<<<<< HEAD
    public Long join(Member member){
=======
    public Long join(Membermember){
>>>>>>> 36907030a37c86492d6aa29771a2f257d3651290
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
