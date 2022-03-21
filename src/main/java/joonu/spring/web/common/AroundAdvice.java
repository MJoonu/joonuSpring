package joonu.spring.web.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;


@Service
@Aspect
public class AroundAdvice {
	
//	@Pointcut("execution(* joonu.spring.web..*Impl.*(..))")
//	public void allPointcut() {}
	
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable{
//		System.out.println("[Before] : 비즈니스 메서드 수행 전에 처리할 내용.");
//		Object returnObj = joinpoint.proceed();
//		System.out.println("[AFTER] : bbb");
//		return returnObj;
		
		
		String method = joinPoint.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object returnObj = joinPoint.proceed();
		stopWatch.stop();
		System.out.println(method + "() 메서드 수행에 걸린 시간 : " + stopWatch.getTotalTimeMillis() + "(ms)초");
		return returnObj;
		
		
	}

}
