package joonu.spring.web.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;


@Service
@Aspect
public class BeforeAdvice {
	
//	@Pointcut("execution(* joonu.spring.web..*Impl.*(..))")
//	public void allPointcut() {}
	
//	public void beforeLog() {
//		System.out.println("[사전처리] : 비즈니스 로직 수행 전 동작");
//	}
	
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		
		System.out.println("[사전처리] : " + method + "() 메서드의 Args 정보 : " + args[0].toString());
	}
}
