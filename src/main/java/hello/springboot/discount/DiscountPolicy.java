package hello.springboot.discount;

import hello.springboot.member.Member;

public interface DiscountPolicy {

    // @retunn 할인 대상 금액
    int discount(Member member, int price);
}
