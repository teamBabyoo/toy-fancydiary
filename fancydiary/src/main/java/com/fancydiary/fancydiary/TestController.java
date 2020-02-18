package com.fancydiary.fancydiary;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/")
	public void hello (HttpServletResponse response) throws IOException {
		response.getWriter().print("hello world");
	}
}
