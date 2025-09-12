package com.example.Lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to Spring MVC");
        model.addAttribute("message", "This page is served using Thymeleaf templates.");
        model.addAttribute("course", "CPAN228 Lab 2");

        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Page");
        model.addAttribute("info", "This application demonstrates Spring Web MVC basics.");
        model.addAttribute("author", "By Sergio Romero n00466753");

        return "about";
    }
}
