package me.dh;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter init");
	}

	// filterchain이 다음 filter로 연결해 준다.
	// 마지막 필터에서 서블릿으로 연결
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter");
		chain.doFilter(request, response);
	}
	
	public void destroy() {
		System.out.println("Filter Destroy");
	}

}
