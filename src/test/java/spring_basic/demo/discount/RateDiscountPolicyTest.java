package spring_basic.demo.discount;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spring_basic.demo.member.Grade;
import spring_basic.demo.member.Member;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {


    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();


    @Test
    @DisplayName("vip는 10퍼센트 할인이 적용되어야 한다")
    void discount() {
        //given
        Member member = new Member(1L, "memberVip", Grade.VIP);
        int discount = rateDiscountPolicy.discount(member, 10000);
        assertEquals(1000, discount);
        //when
        //then
    }
    @Test
    @DisplayName("vip는 10퍼센트 할인이 적용되지 말아야 한다")
    void noDiscount() {
        //given
        Member member = new Member(1L, "memberBasic", Grade.BASIC);
        int discount = rateDiscountPolicy.discount(member, 10000);
        assertEquals(0, discount);
        //when
        //then
    }
}