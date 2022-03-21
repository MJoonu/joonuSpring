package joonu.spring.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
    public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
        String signatureString = joinPoint.getSignature().toShortString();
        System.out.println(signatureString + " ------ start");
        long start = System.currentTimeMillis();

        try {
            Object result = joinPoint.proceed();
            return result;
        } finally {
            long finish = System.currentTimeMillis();
            System.out.println(signatureString + " end ");
            System.out.println(signatureString + " runtime : " + (finish - start) + "ms");
        }
    }
}
