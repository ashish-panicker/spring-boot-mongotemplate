package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	
	
	@RequestMapping("/")
	private String index() {
		return "index.html";
	}
	
	@RequestMapping("/view")
	private String cars() {
		return "cars.html";
	}

}