package spring_basic2.part1_SimpleExample.member;

import java.util.HashMap;
import java.util.Map;

public class DbMemberRepository implements MemberRepository{

    //변수
    private static Map<Long, Member> db_store = new HashMap<>();

    //메서드
    @Override
    public void save(Member member) {

    }

    @Override
    public Member findById(Long memberId) {
        return null;
    }
}
