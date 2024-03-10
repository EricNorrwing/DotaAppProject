package com.ericnorrwing.dotaappproject.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class HeroService {

    private final String baseURL;
    private final RestClient dotaAPIClient;


    public HeroService(@Value("${OpenDota_API_URL}") String baseURL, RestClient dotaRestClient) {
        this.baseURL = baseURL;
        this.dotaAPIClient = dotaRestClient;
    }

    //TODO read StringBuilders, How to assign values to HeroRecord
    public String getHeroInformation(String targetPath){
        String body = this.dotaAPIClient.get().uri(baseURL.concat(targetPath)).retrieve().body(String.class);
        return body;
    }
}
