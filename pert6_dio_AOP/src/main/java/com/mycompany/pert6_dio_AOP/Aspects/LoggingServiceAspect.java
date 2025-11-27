/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert6_dio_AOP.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author DIO
 */
@Aspect
@Component
public class LoggingServiceAspect {
    
    // Logging sebelum method service berjalan
    @Before("execution(* com.mycompany.pert6_dio_AOP.Services.*.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("\n[LOG BEFORE] SERVICE CALL -> Method: " + joinPoint.getSignature().getName());
    }
    
    // Logging setelah method service selesai dan mengembalikan nilai
    @AfterReturning(
            pointcut = "execution(* com.mycompany.pert6_dio_AOP.Services.*.*(..)),",
            returning = "result"
    )
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        System.out.println("[LOG AFTER RETURNING] SERVICE SUCCESS -> Method: " + joinPoint.getSignature().getName());
        System.out.println("[LOG RESULT] Result: " + result);
    }
    
    // Logging jika method service terjadi error
    @AfterThrowing(
            pointcut = "execution(* com.mycompany.pert6_dio_AOP.Services.*.*(..))",
            throwing = "error"
    )
    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("[LOG AFTER THROWING] SERVICE ERROR ->  Method: " + joinPoint.getSignature().getName());
        System.out.println("[LOG RESULT] Message: " + error);
    }
}

