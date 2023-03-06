package spring_basic2.part1_SimpleExample.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import spring_basic2.part1_SimpleExample.member.Gradle;
import spring_basic2.part1_SimpleExample.member.Member;
import spring_basic2.part1_SimpleExample.member.MemberService;
import spring_basic2.part1_SimpleExample.member.MemberServiceImpl;

public class OrderServiceTest {

    //변수
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    //테스트
    @Test
    void createVIPOrder(){
        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Gradle.VIP);

        //when
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "productA", 10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

    @Test
    void createBASICOrder(){
        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Gradle.BASIC);

        //when
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "productA", 10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(0);
    }
}
