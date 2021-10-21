package com.example.ActuatorPrometheus.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

public class Prometheus {
	private Counter counter;
	public Prometheus(MeterRegistry registry) {
		this.counter=Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
		
	}
		
	@GetMapping(path="helloworld")
	public String helloworld() {
		counter.increment();
		return "helloworld";
	}
}
