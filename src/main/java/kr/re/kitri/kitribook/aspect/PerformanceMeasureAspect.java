package kr.re.kitri.kitribook.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1000)
public class PerformanceMeasureAspect {

    @Around("execution(* kr.re.kitri.kitribook.service.KitriBookService.*(..))")
    public Object measureMethodRunningTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String clsNm = joinPoint.getSignature().getDeclaringTypeName();//클래스 명k'
        String methodNm = joinPoint.getSignature().getName();//메소드 명

        long startTime = System.currentTimeMillis();//현재시간

        Object targetMethod = joinPoint.proceed();//메소드 실행. 예외를 떤져~!

        long endTime = System.currentTimeMillis();//끝난시간

        long estimatedTime = endTime-startTime;
        System.out.println(clsNm + "."+methodNm +"메서드의 실행시간은" + estimatedTime);
        return targetMethod;
}
}
