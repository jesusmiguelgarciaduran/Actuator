package com.example.Actuator.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="estados")
public class Estado {
	
	private List<String> lListAds = new ArrayList<>();
	
	

}
