package jbr.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.Login;
//import jbr.springmvc.model.Login;
//import jbr.springmvc.model.User;
//import jbr.springmvc.service.UserService;
@Controller
public class LoginController {
	@Autowired
	  public UserDao UserDAO;

	  
	public UserDao getUserDAO() {
		return UserDAO;
	}
	public void setUserDAO(UserDao userDAO) {
		UserDAO = userDAO;
	}
  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());
    return mav;
  }
  
  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,HttpSession session,
  @ModelAttribute("login") Login login) {
    ModelAndView mav = null;
    Boolean bool = UserDAO.validateUser(login);
    
    if (bool) {
    	session.invalidate();
        HttpSession newSession = request.getSession();
    mav = new ModelAndView("welcome");
    mav.addObject("username", login.getUsername());
    System.out.println(login.getUsername()+login.getPassword());
    } else {
    mav = new ModelAndView("login");
    mav.addObject("message", "Username or Password is wrong!!");
    }
    return mav;
  }

}
