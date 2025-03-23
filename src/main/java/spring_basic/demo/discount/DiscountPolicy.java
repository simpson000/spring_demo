package spring_basic.demo.discount;

import spring_basic.demo.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
