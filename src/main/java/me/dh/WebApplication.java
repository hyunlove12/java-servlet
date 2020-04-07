package me.dh;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class WebApplication implements WebApplicationInitializer{
	// web.xml대신 -> web.xml 삭제
	// bean등록 or dispatcher.properties의 기본값이 중요
	public void onStartup(ServletContext servletContext) throws ServletException {
		// application 생성
		// annotaion기반의 설정
		// dispatcher서블릿 하나로 모든 컨텍스트 생성 -> 계층구조 아님 -> ?????
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		// enableconfiguration 사용 시 필수 
		context.setServletContext(servletContext);
		context.register(WebConfig.class);
		context.refresh();
		
		// dispacherservlet 생성
		DispatcherServlet dispacherServlet = new DispatcherServlet(context);
		// servlet 이름
		ServletRegistration.Dynamic app = servletContext.addServlet("app", dispacherServlet);
		app.addMapping("/app/*");
	}	
	
}
