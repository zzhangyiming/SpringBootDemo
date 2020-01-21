package com.controller;


import com.model.Article;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class testDemo {

    @Value("${name}")
    private String name;


    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "Hello S";
    }

    @RequestMapping("/sayMyName")
    @ResponseBody
    public String sayMyName(){
        return "各位的父亲就是"+name;
    }




    @RequestMapping("/lombok1")
    @ResponseBody
    public Article testlombok1(){
        Article article = Article.builder().id(7).author("zhangyiming").build();
        return article;
    }
}
