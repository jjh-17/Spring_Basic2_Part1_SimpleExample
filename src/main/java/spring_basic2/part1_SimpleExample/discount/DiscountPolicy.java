package spring_basic2.part1_SimpleExample.discount;

import spring_basic2.part1_SimpleExample.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price); //할인 대상 금액 return

}
