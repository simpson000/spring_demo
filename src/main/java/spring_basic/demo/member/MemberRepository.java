package spring_basic.demo.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long id);

}
