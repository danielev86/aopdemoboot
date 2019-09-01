package com.danielev86.aopdemoboot.service.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopServiceInterceptor {
	
	private static final Logger logger = LoggerFactory.getLogger(AopServiceInterceptor.class);
	
	@Around("execution(* com.danielev86.aopdemoboot.service.impl.*.*(..))")
	public Object logAllServiceMethod(ProceedingJoinPoint jointPoint) {
		Object ret = null;
		logger.info(jointPoint.getTarget().getClass().getName() + "- calling method: " + jointPoint.getSignature().getName());
		try {
			ret = jointPoint.proceed();
			if (ret != null) {
				logger.info(jointPoint.getTarget().getClass().getName() + "- method return with no error " + jointPoint.getSignature().getName());
			}
		}catch(Throwable e) {
			logger.error(jointPoint.getTarget().getClass().getName() + "- Errore in calling method: " + jointPoint.getSignature().getName(), e);
		}
		return ret;
	}
	

}
