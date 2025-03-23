package spring_basic.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_basic.demo.discount.DiscountPolicy;
import spring_basic.demo.discount.FixDiscountPolicy;
import spring_basic.demo.discount.RateDiscountPolicy;
import spring_basic.demo.member.MemberRepository;
import spring_basic.demo.member.MemberService;
import spring_basic.demo.member.MemberServiceImpl;
import spring_basic.demo.member.MemoryMemberRepository;
import spring_basic.demo.order.OrderService;
import spring_basic.demo.order.OrderServiceImpl;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        //        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
