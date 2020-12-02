package com.maudev.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maudev.springboot.app.models.Perro;
import com.maudev.springboot.app.models.Persona;

@Controller
public class AppController {

//	PRIMER ENDPOINT O REQUEST ONTIENE  POR STRING TAGS DE HTML
	@RequestMapping("/obtenerMagic")
	@ResponseBody
	String home() {
		return "<h1>Buenas noches Equipo CaC JavaFullStack a romperla</h1> " + "<h2>con Spring Boot</h2>"
				+ "<iframe src=\"https://giphy.com/embed/12NUbkX6p4xOO4\" width=\"120\" height=\"120\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/shia-labeouf-12NUbkX6p4xOO4\">via GIPHY</a></p>";
	}

//	SEGUNDO ENDPOINT O REQUEST
//	OBTIENE LOS DATOS DE LA PERSONA INSTANCIADA
	@RequestMapping("/obtenerPersona")
	@ResponseBody
	String persona() {
		Persona persona1 = new Persona("hector", "orbegoso", 20);

		return persona1.toString();
	}

//	TERCE  ENDPOINT O REQUEST
//	OBTIENE LOS DATOS DEL ONJETO PERRO INSTANCIADO
	@RequestMapping("/obtenerPerro")
	@ResponseBody
	String perro() {

		Perro perro1 = new Perro("branca", "doberman", 1);

		return perro1.toString();
	}

}
