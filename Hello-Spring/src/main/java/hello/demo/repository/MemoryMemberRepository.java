package main.java.hello.demo.repository;

import java.util.List;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store= new HashMap<>();
    private static long sequence = OL;

    @Override
    public Member save(Member member) {
        memeber.setId(++sequence);
        store.put(memeber.getId(), member);
        return memeber;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member → member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    @

}
