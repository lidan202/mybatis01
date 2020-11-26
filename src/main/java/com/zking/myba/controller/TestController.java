package com.zking.myba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestController {

    @ModelAttribute
    public ModelAndView kk(){
        System.out.println("你调用了ModelAndView");
        return new ModelAndView();
    }
    @RequestMapping("/t1")
    public String t1(HttpServletRequest request){
        System.out.println(request.getRequestURI());
        System.out.println("你调用了t1方法");
        return "index";
    }

    @RequestMapping("/login")
    public String goLogin(){
        return "login";
    }

    @RequestMapping("/t/{name}")
    public String test(@PathVariable String name){
        System.out.println(name);
        return "index";
    }
}
