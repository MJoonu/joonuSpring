package joonu.spring.common;

public class LoggingAdvice {
    public void before(){
        System.out.println("[LA] before start method");
    }

    public void afterReturning(Object ret){
        System.out.println("[LA] after ended method, return = " + ret);
    }

    public void afterThrowing(Throwable ex){
        System.out.println("[LA] exception come being the method, exception = " + ex.getClass().getName());
    }

    public void afterFinally(){
        System.out.println("[LA] completed method");
    }
}
