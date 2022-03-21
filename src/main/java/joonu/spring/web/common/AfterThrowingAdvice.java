package joonu.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service
@Aspect
public class AfterThrowingAdvice {

	//	public void exceptionLog() {
	//		System.out.println("[예외처리] : 비즈니스 로직 수행중 예외 발생");
	//	}
	
//	@Pointcut("execution(* joonu.spring.web..*Impl.get*(..))")
//	public void allPointcut() {}
	
	@AfterThrowing(pointcut = "PointcutCommon.allPointcut()", throwing = "e")
	public void exceptionLog(JoinPoint joinPoint, Exception e) {
		String method = joinPoint.getSignature().getName();
		System.out.println("[예외처리] : " + method +
				"() 메서드 수행 중 발생된 예외 메세지 : " + e.getMessage());
	}

}
