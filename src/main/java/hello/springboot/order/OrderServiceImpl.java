package hello.springboot.order;

import hello.springboot.discount.DiscountPolicy;
import hello.springboot.discount.FixDiscountPolicy;
import hello.springboot.member.Member;
import hello.springboot.member.MemberRepository;
import hello.springboot.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
