package hello.springboot.member;

public class MemberApp {
    public static void main(String[] args) {
        MemberSerivce memberSerivce = new MemberServiceImpl();
        new Member(1L, "memberA", Grade.VIP);
    }
}
