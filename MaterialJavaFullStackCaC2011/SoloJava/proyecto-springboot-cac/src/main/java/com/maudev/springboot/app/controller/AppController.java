package com.maudev.springboot.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maudev.springboot.app.models.Perro;
import com.maudev.springboot.app.models.Persona;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class AppController {

//	PRIMER ENDPOINT O REQUEST ONTIENE  POR STRING TAGS DE HTML

	@Operation(summary = "Obtiene home o Magic", description = "" + "con este servicio obtenemos Magic"
			+ "alumnes codo a codo manijas")
	@RequestMapping(value = "/obtenerMagic", method = RequestMethod.GET)
	String home() {
		return "<h1>Buenas noches Equipo CaC JavaFullStack a romperla</h1> " + "<h2>con Spring Boot</h2>"
				+ "<iframe src=\"https://giphy.com/embed/12NUbkX6p4xOO4\" width=\"120\" height=\"120\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/shia-labeouf-12NUbkX6p4xOO4\">via GIPHY</a></p>";
	}

//	SEGUNDO ENDPOINT O REQUEST
//	OBTIENE LOS DATOS DE LA PERSONA INSTANCIADA
	@Operation(summary = "Obtener Persona", description = "" + "con este servicio se obtiene los datos de una persona "
			+ "alumnes codo a codo manijas")

	@RequestMapping(value = "/obtenerPersona", method = RequestMethod.GET)
	String persona() {
		Persona persona1 = new Persona("hector", "orbegoso", 20);

		return persona1.toString();
	}

//	TERCER  ENDPOINT O REQUEST
//	OBTIENE LOS DATOS DEL ONJETO PERRO INSTANCIADO
	@Operation(summary = "Obtener Perro", description = "" + "con este servicio se obtiene los datos de un "
			+ "alumnes codo a codo manijas")
	@RequestMapping(value = "/obtenerPerro", method = RequestMethod.GET)
	@ResponseBody
	String perro() {

		Perro perro1 = new Perro("branca", "doberman", 1);

		return perro1.toString();
	}

}
