package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.OutgoingsService;
    
@Controller
public class OutgoingsingsController {
    
    @Autowired
    private OutgoingsService outgoingsService;
    
    @GetMapping("/outgoings")
    public String listAllIncomings(Model model) {
        model.addAttribute("outgoings", outgoingsService.getAllOutgoings());
        return "index";
    }
}

