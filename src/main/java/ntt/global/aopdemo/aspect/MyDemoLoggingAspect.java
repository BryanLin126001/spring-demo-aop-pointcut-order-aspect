package ntt.global.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect
{



    @Before("LuvAopExpressions.forAllExcludeGetterAndSetter()")
    public void beforeAddAccountAdvice()
    {
        System.out.println("=====> logging before method running !!!");
    }




}
