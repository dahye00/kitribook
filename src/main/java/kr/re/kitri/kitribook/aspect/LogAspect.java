package kr.re.kitri.kitribook.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    //point cut문법을 확인해서 써 봅시다.
    @Before("execution(* kr.re.kitri.kitribook.service.KitriBookService.*(..))")
    public void logBefore(JoinPoint joinPoint) {//메소드 시작 전에 수행
        //@Arround는 메소드의 시작과 끝에 수행(메소드 구동 시간 확인 시 사용 가능)

        String clsNm = joinPoint.getSignature().getDeclaringTypeName();//클래스 명
        String methodNm = joinPoint.getSignature().getName();//메소드 명

        System.out.println(clsNm +"의 " + methodNm + "에서 AOP로 로그를 남깁니다.");
        //advice와 point cut을 합친게 aspect
        //joinPoint.getSignature() - 메소드 이름(가장 많이 씀)
    }


}
