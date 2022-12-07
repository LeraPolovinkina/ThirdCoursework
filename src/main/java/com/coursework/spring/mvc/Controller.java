package com.coursework.spring.mvc;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String showFirstView(){
        return "first_view";
    }

    @RequestMapping("/askDetails")
    public String askMoreDetails(){
        return "ask_more_details_view";
    }

    @RequestMapping("/showDetails")
    public String showMoreDetails(){
        return "show_more_details_view";
    }
}
