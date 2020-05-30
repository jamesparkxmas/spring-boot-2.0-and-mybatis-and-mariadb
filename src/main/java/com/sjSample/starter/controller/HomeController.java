package com.sjSample.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping
	@ResponseBody
	public String ShowMain() {
		return "메인화면입니다";
	}
}
