package com.semenov.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    /////////////НЕДВИЖИМОСТЬ (ДОМА) //////////////
    @RequestMapping("/property-grid")
    public String propertyGrid() {
        return "property-grid";
    }
    @RequestMapping("/property-single")
    public String propertySingle() {
        return "property-single";
    }
    ////////////    БЛОГ (МЕСТА РЯДОМ)   ///////////////
    @RequestMapping("/blog-grid")
    public String blogGrid() {
        return "blog-grid";
    }
    @RequestMapping("/blog-single")
    public String blogSingle() {
        return "blog-single";
    }
    @RequestMapping("contact")
    public String contact(){
        return "contact";
    }
}
