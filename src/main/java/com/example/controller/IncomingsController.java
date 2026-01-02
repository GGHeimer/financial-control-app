package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.IncomingsService;

@Controller
public class IncomingsController {
    
    @Autowired
    private IncomingsService incomingsService;
    
    @GetMapping("/incomings")
    public String listAllIncomings(Model model) {
        model.addAttribute("incomings", incomingsService.getAllIncomings());
        return "index";
    }
}
