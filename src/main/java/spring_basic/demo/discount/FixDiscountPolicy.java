package spring_basic.demo.discount;

import spring_basic.demo.member.Grade;
import spring_basic.demo.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;

        }
        else {
            return 0;

        }
    }
}
