package spring_basic.demo;

import spring_basic.demo.member.Grade;
import spring_basic.demo.member.Member;
import spring_basic.demo.member.MemberService;
import spring_basic.demo.member.MemberServiceImpl;


public class MemberApp {


    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println(findMember);
        System.out.println("findMember.getName() = " + findMember.getName());
    }
}
