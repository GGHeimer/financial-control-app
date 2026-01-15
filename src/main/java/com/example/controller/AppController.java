package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Incomings;
import com.example.model.Outgoings;
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
        Double incomingsSum = incomingsService.getTotalIncomings();
        Double outgoingsSum = outgoingsService.getTotalOutgoings();
        Double balance = Math.round((incomingsSum - outgoingsSum) * 100.0) / 100.0;
        
        model.addAttribute("incomingsList", incomingsService.getAllIncomings());
        model.addAttribute("outgoings", outgoingsService.getAllOutgoings());
        model.addAttribute("incoming", new Incomings());
        model.addAttribute("incomingsSum", incomingsSum);
        model.addAttribute("outgoingsSum", outgoingsSum);
        model.addAttribute("balance", balance);
        model.addAttribute("incomingsTotalByName", incomingsService.getTotalIncomingsByName());
        model.addAttribute("outgoingsTotalByName", outgoingsService.getTotalOutgoingsByName());
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

    @RequestMapping(value="/add-outgoing", method=RequestMethod.GET)
    public String showAddOutgoingForm(Model model) {
        model.addAttribute("outgoing", new Outgoings());
        return "add-outgoing";
    }


    @RequestMapping(value="/incoming/delete/{id}", method=RequestMethod.GET)
    public String deleteIncomingByIda(@PathVariable Long id) {
        incomingsService.deleteIncomingById(id);
        return "redirect:/";
    }

    @RequestMapping(value="/update-incoming/{id}", method=RequestMethod.GET)
    public String showUpdateIncomingForm(@PathVariable Long id, Model model) {
        Incomings incoming = incomingsService.getIncomingById(id);
        model.addAttribute("incoming", incoming);
        return "update-incoming";
    }

    @RequestMapping(value="/update-incoming", method=RequestMethod.POST)
    public String updateIncoming(Incomings incoming) {
        incomingsService.saveIncomings(incoming);
        return "redirect:/";
    }
    
     @RequestMapping(value="/add-outgoing", method=RequestMethod.POST)
    public String saveOutgoings(Outgoings outgoings) {
        outgoingsService.saveOutgoings(outgoings);
        return "redirect:/";
    }

    @RequestMapping(value="/outgoing/delete/{id}", method=RequestMethod.GET)
    public String deleteOutgoingById(@PathVariable Long id) {
        outgoingsService.deleteOutgoingById(id);
        return "redirect:/";
    }

    @RequestMapping(value="/update-outgoing/{id}", method=RequestMethod.GET)
    public String showUpdateOutgoingForm(@PathVariable Long id, Model model) {
        Outgoings outgoing = outgoingsService.getOutgoingById(id);
        model.addAttribute("outgoing", outgoing);
        return "update-outgoing";
    }

    @RequestMapping(value="/update-outgoing", method=RequestMethod.POST)
    public String updateOutgoing(Outgoings outgoing) {
        outgoingsService.saveOutgoings(outgoing);
        return "redirect:/";
    }
    
}