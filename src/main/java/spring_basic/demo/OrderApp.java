package spring_basic.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_basic.demo.member.Grade;
import spring_basic.demo.member.Member;
import spring_basic.demo.member.MemberService;
import spring_basic.demo.member.MemberServiceImpl;
import spring_basic.demo.order.Order;
import spring_basic.demo.order.OrderService;
import spring_basic.demo.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = (MemberService) applicationContext.getBean("memberService");
        OrderService orderService = (OrderService) applicationContext.getBean("orderService");

        long memberId = 1L;

        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);

    }
}
