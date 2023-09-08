package com.devtools.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String Test() {
		int a = 15;
		int b = 10;
		return "This is devTool testing. Sum is " + (a+b); 
	}
}
