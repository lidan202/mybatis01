package com.zking.myba.controller;

import com.zking.myba.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("abc")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("你调用了这个方法");
        return "index";
    }

    @RequestMapping("/helloB")
    public String helloB(String username){
        System.out.println(username+"调用了'helloB'这个方法");
        return "index";
    }

    @RequestMapping("/helloC")
    public String helloC(Book book){
        System.out.println(book);
        return "index";
    }
}
