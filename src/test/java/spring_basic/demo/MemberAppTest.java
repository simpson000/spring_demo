package spring_basic.demo;

import org.junit.jupiter.api.Test;
import spring_basic.demo.member.Grade;
import spring_basic.demo.member.Member;
import spring_basic.demo.member.MemberService;
import spring_basic.demo.member.MemberServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class MemberAppTest {
    MemberService memberService = new MemberServiceImpl();


    @Test
    void main() {
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
        Member find = memberService.findMember(1L);
        assertEquals(member, find);
    }
}