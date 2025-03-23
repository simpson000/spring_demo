package spring_basic.demo.discount;

import spring_basic.demo.member.Grade;
import spring_basic.demo.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercentage = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercentage / 100;
        }
        else {
            return 0;
        }
    }
}
