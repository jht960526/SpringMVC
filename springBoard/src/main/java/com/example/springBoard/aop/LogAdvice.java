package com.example.springBoard.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Aspect
public class LogAdvice {

    /*
     * private : 외부에서 로그를 가로채지 못하도록 하기 위함
     * static final : 로그 내용에 변동이 없기 때문에
     * 로그를 System.out이 아닌 logger.error로 출력하는 이유 : system.out.println을 남용하면 리소스를 많이 사용하여 시스템이 느려질 수 있다. 로그를 파일로 저장하여 분석
     */

    private static final Logger logger = LoggerFactory.getLogger(LogAdvice.class);

    @AfterThrowing(value = "@annotation(com.example.springBoard.annotation.LogException)", throwing = "exception")
    public void exception(JoinPoint joinPoint, Exception exception) {
        System.out.println("🔥 AfterThrowing 진입 성공!");
        logger.error("error class : " + exception.getClass().getSimpleName());
        logger.error("error method name : " + joinPoint.getSignature().getName());
        logger.error("errorCause : " + exception.getCause());
        logger.error("errorMessage : " + exception.getMessage());
    }

    @AfterReturning(value = "@annotation(com.example.springBoard.annotation.LogException)", returning = "result")
    public void AfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("실행된 클래스 : " + joinPoint.getTarget().getClass().getSimpleName());
        System.out.println("실행된 메서드 : " + joinPoint.getSignature().getName());
        System.out.println("전달된 파라미터 : " + Arrays.toString(joinPoint.getArgs()));
    }
}
