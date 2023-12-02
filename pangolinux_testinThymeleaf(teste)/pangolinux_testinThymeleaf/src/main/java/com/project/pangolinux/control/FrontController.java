package com.project.pangolinux.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

	@GetMapping("/login")
	public String login_xhtml() {
		return "login_xhtml";
	}
}
