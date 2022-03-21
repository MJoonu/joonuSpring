package joonu.spring.common;

import joonu.spring.member.vo.UpdateInfo;
import org.aspectj.lang.JoinPoint;

public class UpdateMemberInfoTraceAdvice {
    public void traceReturn(JoinPoint joinPoint, boolean result, String memberId, UpdateInfo info) {
        System.out.println("recovering [TA] information : result = " + result + ", the member = " + memberId +" "+
                "edited inform = " + info);
    }
}
