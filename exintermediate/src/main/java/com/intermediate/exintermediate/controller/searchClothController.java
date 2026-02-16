package com.intermediate.exintermediate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intermediate.exintermediate.domain.searchCloth;
import com.intermediate.exintermediate.service.searchClothService;

@Controller
@RequestMapping("/ex03")
public class searchClothController {
    
    @Autowired
    private searchClothService service;

    @RequestMapping("")
    public String index(Model model){
        return "inputClothDate";
    }

    @RequestMapping("/searchCloth")
    private String searchByColorAndGender(Integer gender, String color,Model model){
        List<searchCloth> clothList = service.searchByColorAndGender(gender, color);
        model.addAttribute("clothList", clothList);
        System.out.println(clothList);
        return "inputClothDate";
    }
}
