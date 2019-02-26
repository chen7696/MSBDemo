package com.chen.officialBuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SmileController {

	@RequestMapping("/smile")
	@ResponseBody
	public String Hello(){
		System.out.println(">>>>>>>>>>>>>>>>>运行Smile");
		return "<h1>笑一笑!</h1>";
	}
}
