package com.register.client.api.registration.response;

import org.springframework.stereotype.Component;

@Component
public class ApiRegistrationResponse {
	
	private String clientId;
	private String secret;
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	
	

}
