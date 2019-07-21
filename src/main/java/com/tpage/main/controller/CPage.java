package com.tpage.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CPage {
    @RequestMapping("/index")
    public String index(){

        return "index";
    }

}
