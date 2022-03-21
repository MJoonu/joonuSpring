package joonu.spring.member.service;

import joonu.spring.board.vo.MemberVO;
import joonu.spring.member.vo.UpdateInfo;

public interface MemberService {
    void regist(MemberVO member);
    boolean update(String memberId, UpdateInfo info);
}
