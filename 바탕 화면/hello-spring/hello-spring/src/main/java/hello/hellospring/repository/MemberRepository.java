package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 이 메서드는 List<Member>를 반환해야 합니다.
    void clearStore(); // 추가된 clearStore 메서드
}
