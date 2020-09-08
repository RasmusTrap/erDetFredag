package com.example.demo.controllers;

import com.example.demo.services.Fredag;
import com.example.demo.services.WorldSimpleseCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {


    @GetMapping("/fredag")
    @ResponseBody
    public String calc(String erDetFredag){
        Fredag fred = new Fredag();
        fred.erDetFredag();

        return fred.erDetFredag();


    }

}
