package me.dh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	// 핸들러 매핑 등록
	
	public void configureViewResolver(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/", ".jsp");
	}
		
	
	/*
	@Bean
	public HandlerMapping handlerMapping() {
		// 요청을 처리할 수 있는 메소드를 찾아주는 역할
		// app/hello -> app까지는 disapcher에 매핑 그 후 hello에 대한 처리 부분 확인 해주는 역할 
		RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
		// 처리 전에 적용되는 인터셉터
		// handlerMapping.setInterceptors();
		// 핸들러 매핑 순서 -> 우선순위 설정
		handlerMapping.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return handlerMapping;
	}
	
	@Bean
	public HandlerAdapter handlerAdapter() {
		RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
		// pathvariable, requestparam 등의 아규먼트 설정
		//handlerAdapter.setArgumentResolvers();
		return handlerAdapter;		
	}
	
	@Bean 
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	*/
}
