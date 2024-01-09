package hello.springboot.member;

public interface MemberSerivce {

    void join(Member member);
    Member findMember(Long memberId);

}
