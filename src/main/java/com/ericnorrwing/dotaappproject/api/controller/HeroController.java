package com.ericnorrwing.dotaappproject.api.controller;

import com.ericnorrwing.dotaappproject.api.service.Hero;
import com.ericnorrwing.dotaappproject.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {


    private HeroService heroService;
    @Autowired
    public HeroController(HeroService heroService){
        this.heroService = heroService;
    }
    @GetMapping
    public Hero getHero(@RequestParam Integer id){
        return "TODO"
    }
}
