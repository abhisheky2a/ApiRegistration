package com.register.client.api.registration.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("api-registration-service")
public class ApiRegistrationConfiguration {

	
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
