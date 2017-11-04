package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.User;
//import jbr.springmvc.service.UserService;
@Controller
public class RegistrationController   {
  @Autowired
  public UserDao UserDAO;

  
public UserDao getUserDAO() {
	return UserDAO;
}
public void setUserDAO(UserDao userDAO) {
	this.UserDAO = userDAO;
}
@RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("user", new User());
    return mav;
  }
  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,@Validated @ModelAttribute("user") User user, BindingResult result) {
	   System.out.println("in registerprocess");
 // userDao.register(user);
/*	  System.out.println(user.getFirstname()+"  "+user.getLastname()+" "+ user.getEmail());
*/
	  
	  UserDAO.saveUser(user);
	  System.out.println("in registerprocess after data save");
	  //return new ModelAndView("redirect:list.htm");
  return new ModelAndView("welcome", "firstname", user.getFirstname());
  }
}