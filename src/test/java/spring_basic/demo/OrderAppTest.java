package spring_basic.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring_basic.demo.member.Grade;
import spring_basic.demo.member.Member;
import spring_basic.demo.order.Order;
import spring_basic.demo.member.MemberService;
import spring_basic.demo.member.MemberServiceImpl;
import spring_basic.demo.order.OrderService;
import spring_basic.demo.order.OrderServiceImpl;


import static org.junit.jupiter.api.Assertions.*;

class OrderAppTest {
    MemberService memberService;
    OrderService orderService;
    @BeforeEach
    void setUp() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

}