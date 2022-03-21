package joonu.spring.common;

import org.aspectj.lang.annotation.Pointcut;


public class PublicPointcut {
    @Pointcut("execution(public * joonu.spring..*(..))")
    public void publicMethod(){

    }
}
