package com.sjSample.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {
	@RequestMapping("/article/main")
	@ResponseBody
	public String ShowList() {
		return "게시물 리스트";
	}
}
