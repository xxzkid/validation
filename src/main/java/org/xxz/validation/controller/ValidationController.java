package org.xxz.validation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.xxz.validation.bean.User;

@Controller
public class ValidationController {

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView addCustomer(HttpServletRequest request, HttpServletResponse response, @Valid User user, BindingResult result) {
        ModelAndView m = new ModelAndView();
        
        if(result.hasErrors()) {
            m.setViewName("user");
        } else {
            m.setViewName("ok");
        }
        return m;
    }
    
    @RequestMapping(value = "/user")
    public ModelAndView customer(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView m = new ModelAndView("user");
        return m;
    }
    
    
}
