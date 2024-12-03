package com.btl.qltv.btljava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sach")
public class BookController {
	
	@GetMapping("/home")
	public String goHome() {
		return "sach/home";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "sach/login";
	}
	@GetMapping("register")
	public String showRegister() {
		return "sach/register";
	}
}
