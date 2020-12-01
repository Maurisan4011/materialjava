package com.maudev.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ProyectoSpringbootCacApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "<h1>Buenas noches Equipo CaC JavaFullStack a romperla</h1> " 
	+ "<h2>con Spring Boot</h2>" + "<iframe src=\"https://giphy.com/embed/12NUbkX6p4xOO4\" width=\"120\" height=\"120\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/shia-labeouf-12NUbkX6p4xOO4\">via GIPHY</a></p>";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringbootCacApplication.class, args);
	}

}
