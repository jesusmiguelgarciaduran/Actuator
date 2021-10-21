package com.example.Actuators;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RestControllerEndpoint(id="customEndPoint")
public class Custom {
	
	public ResponseEntity<String> customEndPoint(){
		return new ResponseEntity<>("prueba",HttpStatus.OK);
	}
}
