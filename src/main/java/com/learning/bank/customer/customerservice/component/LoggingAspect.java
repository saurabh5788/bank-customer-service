package com.learning.bank.customer.customerservice.component;

import java.time.Instant;

import lombok.extern.slf4j.Slf4j;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import com.learning.bank.customer.customerservice.annotation.Loggable;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
	@Before("loggingPointCut()")
	public void beforeAdvice(JoinPoint joinPoint) {
		log.debug(getMethodMessage(joinPoint) + " | Entering : {}.{} with {}",
				joinPoint.getSignature().getDeclaringTypeName(), joinPoint
						.getSignature().getName(), joinPoint.getArgs());
	}

	@AfterReturning(pointcut = "loggingPointCut()", returning = "returnValue")
	public void afterAdvice(JoinPoint joinPoint, Object returnValue) {
		log.debug(getMethodMessage(joinPoint) + " | Exiting : {}.{} with {}",
				joinPoint.getSignature().getDeclaringTypeName(), joinPoint
						.getSignature().getName(), returnValue);
	}

	@Around("loggingPointCut()")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint)
			throws Throwable {
		long start = Instant.now().toEpochMilli();
		Object proceed = joinPoint.proceed();
		long executionTime = Instant.now().toEpochMilli() - start;
		log.debug(getMethodMessage(joinPoint) + " | Executed {} in {}ms",
				joinPoint.getSignature(), executionTime);
		return proceed;
	}

	@Pointcut("@within(com.learning.bank.customer.customerservice.annotation.Loggable)")
	private void loggingPointCut() {
	}

	private String getMethodMessage(JoinPoint joinPoint) {
		Loggable loggableAnnotation = AnnotationUtils.findAnnotation(joinPoint
				.getSignature().getDeclaringType(), Loggable.class);
		return loggableAnnotation.value();
	}

	/*
	 * @Pointcut(
	 * "@annotation(com.learning.bank.customer.customerservice.annotation.Loggable) || @within(com.learning.bank.customer.customerservice.annotation.ApiRestEndpoint)"
	 * ) private void loggingPointCut() { }
	 */
}
