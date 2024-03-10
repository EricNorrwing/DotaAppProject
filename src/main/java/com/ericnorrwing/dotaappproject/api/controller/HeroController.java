package com.ericnorrwing.dotaappproject.api.controller;

import com.ericnorrwing.dotaappproject.api.service.HeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {




    private final HeroService heroService;

    //TODO @Value read up
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("/api/heroes")
    public String getHero(){
       return this.heroService.getHeroInformation("/Heroes");
    }


}
