package joonu.spring.web.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//@Service
//@Aspect
public class LogAdvice {
	
//	public void printLog() {
//		System.out.println("[로그] : 비즈니스 로직 수행 전 동작");
//	}
	
//	@Pointcut("execution(* joonu.spring.web..*Impl.*(..))")
	public void allPointcut() {}
	
//	@Pointcut("execution(* joonu.spring.web..*Impl.get*(..))")
//	@Before("allPointcut()")
	public void getPointcut() {
		
		System.out.println("[public log] - start before business logic");
		
	}
	
}
