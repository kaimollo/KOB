package com.kob.backend.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk")
public class indexController {
    @RequestMapping("/index")
    public String test(Model model){
        model.addAttribute("msg","hello ,Spriboot");
        return "index";
    }
}
