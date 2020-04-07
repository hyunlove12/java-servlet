package me.dh;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
	
	// context라이프 사이클	
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context Initialized");
		sce.getServletContext().setAttribute("name", "dh");
	}	
	
	public void contextDestroyed(ServletContextEvent sce) {
		// servlet종료 후 context 종료
		// 리스너는 서블릿 컨텍스트 위의 개념 -> 리스너들이 서블릿 컨테이너의 변경, 요청 등을 감지 -> 요청 받으면 필터를 거친다.
		System.out.println("Context Destroyed");
	}
}
