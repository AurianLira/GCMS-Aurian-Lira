package br.edu.ifpe.recife.gcms.WepApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

	//mais um comentário 
	
	@RequestMapping("/aurianlira")
	public @ResponseBody String greetingFulano() {
		return "Hello, Aurian Moura de Lira!";
	}

	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
		return "Hello, Hotfix!";
	}
}
