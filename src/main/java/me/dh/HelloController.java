package me.dh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	HelloService helloServcie;
	
	/**
	 * 
	 * /hello/1?name=dh&age=25
	 * @RequestBody -> 요청 본문에 있는 메시지를 파라미터에 바인딩
	 * @ResponseBody -> 응답값을 본문에 바인딩 
	 * @ModelAttribute
	 * @RequsetParam
	 * @param id
	 * @param name
	 * @return
	 */
	@GetMapping("/hello/{id}")
	public @ResponseBody String hello(@PathVariable int id, @RequestAttribute String user, @RequestBody String body) {
		// model and view 객체가 null
		return "Hello, " + helloServcie.getName();
	}
	
	@GetMapping("/sample")
	public String sample() {
		// requestToViewNameTranlator -> void로 view이름이 없을 경우 요청으로 view이름을 판단 
		return "sample";
	}	
	
}
