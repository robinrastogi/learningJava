package com.journaldev.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @author Robin
 * 
 * Spring Interceptor are used to intercept client requests and process them. 
 * Sometimes we want to intercept the HTTP Request and do some processing before 
 * handing it over to the controller handler methods.
 * 
 * If there are multiple spring interceptors configured, preHandle() method is executed 
 * in the order of configuration whereas postHandle() and afterCompletion() methods are 
 * invoked in the reverse order.
 */
public class RequestProcessingTimeInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory
			.getLogger(RequestProcessingTimeInterceptor.class);

	/* 
	 * This method is used to intercept the request before it�s handed over to the handler method. 
	 * This method should return �true� to let Spring know to process the request through another 
	 * spring interceptor or to send it to handler method if there are no further spring interceptors. 
	 * If this method returns �false� Spring framework assumes that request has been handled by the 
	 * spring interceptor itself and no further processing is needed. We should use response object 
	 * to send response to the client request in this case. Object handler is the chosen handler object 
	 * to handle the request. This method can throw Exception also, in that case Spring MVC Exception 
	 * Handling should be useful to send error page as response.
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		logger.info("Request URL::" + request.getRequestURL().toString()
				+ ":: Start Time=" + System.currentTimeMillis());
		request.setAttribute("startTime", startTime);
		return true;
	}

	/* 
	 * This HandlerInterceptor interceptor method is called when HandlerAdapter has invoked 
	 * the handler but DispatcherServlet is yet to render the view. 
	 * This method can be used to add additional attribute to the ModelAndView object to be 
	 * used in the view pages. We can use this spring interceptor method to determine the time 
	 * taken by handler method to process the client request. 
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("Request URL::" + request.getRequestURL().toString()
				+ " Sent to Handler :: Current Time=" + System.currentTimeMillis());
	}

	/* 
	 * This is a HandlerInterceptor callback method that is called once the handler is executed and view is rendered.
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (Long) request.getAttribute("startTime");
		logger.info("Request URL::" + request.getRequestURL().toString()
				+ ":: End Time=" + System.currentTimeMillis());
		logger.info("Request URL::" + request.getRequestURL().toString()
				+ ":: Time Taken=" + (System.currentTimeMillis() - startTime));
	}

}
