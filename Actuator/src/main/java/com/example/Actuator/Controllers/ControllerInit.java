package com.example.Actuator.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerInit {
	
	@GetMapping("/prueba/{number}")
	public String prueba(@PathVariable int number) {
		String sTexto;
		if(number>0) {
			sTexto="Es positivo";
		}else {
			sTexto="Es negativo";
		}
		
		return sTexto;
	}
}
