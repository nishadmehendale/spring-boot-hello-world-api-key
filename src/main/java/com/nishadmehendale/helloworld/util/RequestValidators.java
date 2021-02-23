package com.nishadmehendale.helloworld.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RequestValidators {

	@Value("${API_KEY}")
	private String configuredApiKey; 
	
	public boolean isValidApiKey(String apiKey) {
		if (apiKey == null || apiKey.isBlank() || !apiKey.equals(configuredApiKey)) {
			return false;
		} else {
			return true;
		}
	}
	
}
