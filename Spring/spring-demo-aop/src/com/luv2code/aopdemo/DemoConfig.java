package com.luv2code.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.luv2code.aopdemo")
public class DemoConfig {

	//the annotations used in this class are similar to the below xml configurations
	/*
	<aop:aspectj-autoproxy />
	 
	<context:component-scan base-package="com.luv2code.aopdemo" />
	 
	<bean id="loggingAspect" class="com.luv2code.aopdemo.DemoConfig" />
	*/
}
