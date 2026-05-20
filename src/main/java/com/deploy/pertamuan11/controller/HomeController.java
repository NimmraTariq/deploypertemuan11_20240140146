package com.deploy.pertamuan11.controller;

import com.deploy.pertamuan11.model.User;
import com.deploy.pertamuan11.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

	private final AuthService authService;

	@GetMapping("/home")
	public String home(Model model) {

		User user = authService.getLoggedInUser();

		model.addAttribute("user", user);

		return "home";
	}
}
