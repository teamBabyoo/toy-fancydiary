package com.fancydiary.fancydiary;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/")
	public String root() {
		return "test";
	}
	
	@RequestMapping(value="/test")
	public String test() {
		return "views/test";
	}
}