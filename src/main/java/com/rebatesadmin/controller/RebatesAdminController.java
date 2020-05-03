package com.rebatesadmin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rebatesadmin.service.UserServiceImpl;


@RestController
public class RebatesAdminController{


    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value={"/"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }


   /*@RequestMapping(value="/home", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        modelAndView.addObject("userName", "Welcome " + auth.getName() + "!");
        modelAndView.setViewName("/home");
        return modelAndView;
    }*/


    @ModelAttribute("user")
    public String getUser(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        modelAndView.addObject("userName", "Welcome " + auth.getName() + "!");
        return auth.getName();

    }
}
