package com.example.Actuator.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class Prometheus {
	
	private Counter counter;
	
	public Prometheus(MeterRegistry registry) {
		this.counter=Counter.builder("Buenas.Tardes").description("Saludo amistoso").register(registry);
		
	}
		
	@GetMapping(path="helloworld")
	public String helloworld() {
		counter.increment();
		String sContador= String.valueOf(counter);
		return "Buenas tardes"+sContador;
	}
}
