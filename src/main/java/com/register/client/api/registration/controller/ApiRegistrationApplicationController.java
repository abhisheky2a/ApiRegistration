/***************************************
 ** @author		Abhishek Chakraborty
 ** @codeName	abhisheky2a
 ** @Date		9 Jul 2019	
 ***************************************/

package com.register.client.api.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.register.client.api.registration.configuration.ApiRegistrationConfiguration;
import com.register.client.api.registration.response.ApiRegistrationResponse;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/operations/register")
@Api(value="ApiRegistrationApplication", description="Operations pertaining to client registration to call the AdvancedTelecomBillingComp APIs")



public class ApiRegistrationApplicationController {
	
	@Autowired
	ApiRegistrationResponse response;
	
	@Autowired
	ApiRegistrationConfiguration configuration;
	
    //@RequestMapping(method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE) 
    @RequestMapping(method = RequestMethod.GET) 
    public ApiRegistrationResponse registerClient() {
    	response.setClientId(configuration.getClientId());
    	response.setSecret(configuration.getSecret());
        return response;
    }
	
	

}
