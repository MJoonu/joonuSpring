package joonu.spring.member.service;

import joonu.spring.board.vo.MemberVO;
import joonu.spring.member.vo.UpdateInfo;

public class MemberServiceImpl implements MemberService{
    @Override
    public void regist(MemberVO member) {
        System.out.println("MemberServiceImpl.regist() -------- start");
    }

    @Override
    public boolean update(String memberId, UpdateInfo info) {
        System.out.println("MemberServiceImpl.update() ------- start");
        return true;
    }
}
