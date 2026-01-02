package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Incomings;
import com.example.service.IncomingsService;
import com.example.service.OutgoingsService;

@Controller
public class AppController {
    
    @Autowired
    private IncomingsService incomingsService;
    @Autowired
    private OutgoingsService outgoingsService;
    
    @RequestMapping("/")
    public String listAllIncOut(Model model) {
        model.addAttribute("incomings", incomingsService.getAllIncomings());
        model.addAttribute("outgoings", outgoingsService.getAllOutgoings());
        model.addAttribute("incoming", new Incomings());
        return "index";
    }

    @RequestMapping(value="/add-incoming", method=RequestMethod.GET)
    public String showAddIncomingForm(Model model) {
        model.addAttribute("incoming", new Incomings());
        return "add-incoming";
    }

    @RequestMapping(value="/add-incoming", method=RequestMethod.POST)
    public String saveIncomings(Incomings incomings) {
        incomingsService.saveIncomings(incomings);
        return "redirect:/";
    }
    
}