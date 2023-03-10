package spring_basic2.part1_SimpleExample.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spring_basic2.part1_SimpleExample.member.Gradle;
import spring_basic2.part1_SimpleExample.member.Member;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    //변수
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    //테스트
    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야한다.")
    void testVipDiscount(){
        //given
        Member member = new Member(1L, "memberVIP", Gradle.VIP);

        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("BASIC은 10% 할인이 적용되어야한다.")
    void testBasicDiscount(){
        //given
        Member member = new Member(1L, "memberBASIC", Gradle.BASIC);

        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(0);
    }
}