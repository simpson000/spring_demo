package spring_basic.demo.order;

import spring_basic.demo.discount.DiscountPolicy;
import spring_basic.demo.discount.FixDiscountPolicy;
import spring_basic.demo.discount.RateDiscountPolicy;
import spring_basic.demo.member.Member;
import spring_basic.demo.member.MemberRepository;
import spring_basic.demo.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository ;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy
            discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
