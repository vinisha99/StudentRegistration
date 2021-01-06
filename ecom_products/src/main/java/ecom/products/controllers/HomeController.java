package ecom.products.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String showHomepage() {
		System.out.println("In Home Page");
		return "home";
	}
}
