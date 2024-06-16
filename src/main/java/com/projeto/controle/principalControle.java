package com.projeto.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalControle {
	@GetMapping
	public String acessarPrincipal() {
		return "administrativo/home";
	}
	
}
