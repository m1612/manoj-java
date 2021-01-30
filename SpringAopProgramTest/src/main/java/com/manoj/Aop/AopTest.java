package com.manoj.Aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTest {
	
	@Pointcut("execution() " )
	public void test() {
		
		
	}
	
	
	
	
	
	
	

}
