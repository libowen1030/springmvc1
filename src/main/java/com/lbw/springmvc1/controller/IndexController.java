package com.lbw.springmvc1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class IndexController {


    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("data","我是李博文 我爱学习 学习爱我 3天拿下 springmvc");
        return "add";
    }
}
