package me.dh;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// beannamehandlermapping
@org.springframework.stereotype.Controller("/simple")
public class SimpleController implements Controller {
	
	// 하나의 새로운 핸들러 어댑터가 된다. 
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/// 뷰와모델을 같이 넣는다. -> (jsp, model)
		 
		return new ModelAndView("simple");
	}

}
