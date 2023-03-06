package spring_basic2.part1_SimpleExample.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
