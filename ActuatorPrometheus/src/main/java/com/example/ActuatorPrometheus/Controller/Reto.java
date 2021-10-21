package com.example.ActuatorPrometheus.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Reto {
	@GetMapping("/reto/{number}/{string}")
	public String prueba(@PathVariable int number,@PathVariable String string) {
		
		String sTexto;
		if(number>0) {
			sTexto="Es positivo";
		}else {
			sTexto="Es negativo";
		}
		
		return sTexto+""+string;
	}
}
