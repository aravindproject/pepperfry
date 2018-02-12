package com.pepperfry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pepperfry.model.User;
import com.pepperfry.service.UserService;

@Controller
public class UserController {

	@Autowired
	public  UserService userService;

	@RequestMapping(value="signup")
	public ModelAndView user(@ModelAttribute("userdetails")User user)
	{
		return new ModelAndView("registration");
	}

	@RequestMapping(value="saveUser")
	public ModelAndView saveUser(User user)
	{
	    userService.save(user);
	    return new ModelAndView("redirect:/index");
	}
	
	@RequestMapping("cart")
	public ModelAndView cart()
	{
		return new ModelAndView("Cart");
	}
}
