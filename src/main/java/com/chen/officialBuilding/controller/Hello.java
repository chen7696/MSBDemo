package com.chen.officialBuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

	@RequestMapping("/hello2")
	@ResponseBody
	public String Hello(){
		System.out.println(">>>>>>>>>>>>>>>>>运行hello2");
		return "<h1>HelloWorld!</h1>";
	}
}
