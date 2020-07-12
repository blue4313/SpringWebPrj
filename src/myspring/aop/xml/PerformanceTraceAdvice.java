package myspring.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceTraceAdvice {
	
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " 시작");
		
		// 호출 전
		long start = System.currentTimeMillis();
		
		try {
			//메서드 호출
			Object result = joinPoint.proceed();
			return result;
			
		} finally {
			// 호출 후
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + " 종료");
			System.out.println(signatureString + " 실행시간 : " + (finish - start) + " ms");
		}
		
	}
}
