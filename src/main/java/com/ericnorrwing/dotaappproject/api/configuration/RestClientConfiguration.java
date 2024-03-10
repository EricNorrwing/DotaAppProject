package com.ericnorrwing.dotaappproject.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfiguration {
    @Bean
    public RestClient dotaRestClient(){
        //TODO read up on builder.build
        return RestClient.builder().build();
    }
}
