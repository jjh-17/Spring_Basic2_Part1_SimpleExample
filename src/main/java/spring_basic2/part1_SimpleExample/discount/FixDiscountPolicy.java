package spring_basic2.part1_SimpleExample.discount;

import spring_basic2.part1_SimpleExample.member.Gradle;
import spring_basic2.part1_SimpleExample.member.Member;

/*
고정 할인률
 */
public class FixDiscountPolicy implements DiscountPolicy {

    //변수
    private int fixedDiscountAmount = 1000;

    //메서드
    @Override
    public int discount(Member member, int price) {
        if(member.getGradle() == Gradle.VIP){
            return fixedDiscountAmount;
        }
        return 0;
    }
}
