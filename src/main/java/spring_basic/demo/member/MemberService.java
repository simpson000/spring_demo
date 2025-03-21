package spring_basic.demo.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);

}
