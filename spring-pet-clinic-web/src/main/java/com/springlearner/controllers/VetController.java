package com.springlearner.controllers;

import com.springlearner.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/","/index","/index.html"})
    public String getVets(Model model){

        model.addAttribute("Vets",vetService.findAll());

        return "vets/index";
    }

}
