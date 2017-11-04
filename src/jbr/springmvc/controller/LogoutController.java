package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.User;
@Controller
public class LogoutController {

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response ) {
	   request.getSession(false).invalidate();
	   
		ModelAndView mav = new ModelAndView("logout");
	//    mav.addObject("user", new User());
	    return mav;
	  }
}
