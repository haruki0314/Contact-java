package com.example.hoge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
	@RequestMapping("/")
	public String contact() {
		return "contact/contact";
	}
	
}
