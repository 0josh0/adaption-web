package com.adaption.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.adaption.web.bean.LoginForm;

@Controller
public class LoginController {
    @RequestMapping(value="test")
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
        String username = command.getUsername();
        ModelAndView mv = new ModelAndView("/test/index","command","LOGIN SUCCESS, " + username);
        System.out.println("test");
        return mv;
    }
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index(){
    	System.out.println("index");
        return "index";
    }
    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String home(){
        System.out.println("home");
    	return "redirect:/html/index.html";
    }
}