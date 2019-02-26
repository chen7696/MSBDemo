package com.chen.officialBuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NiHao {

	@RequestMapping("/niHao")
	@ResponseBody
	public String NiHao(){
		System.out.println(">>>>>>>>>>>>>>>>>运行niHao");
		return "<h1>你好世界!</h1>";
	}
}
