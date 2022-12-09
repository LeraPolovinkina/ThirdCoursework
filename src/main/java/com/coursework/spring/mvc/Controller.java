package com.coursework.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

//    @RequestMapping("/showDetails")
//    public String showMoreDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. "+empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " - employee");
//        return "show_more_details_view";
//    }
    @RequestMapping("/showDetails")
    public String showMoreDetails(@RequestParam("employeeName") String empName, Model model){
        empName = " Mr. "+empName+"!";
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - employee");
        return "show_more_details_view";
}
}
