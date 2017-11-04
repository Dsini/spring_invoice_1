package jbr.springmvc.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.dao.BillDao;
import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.Bill;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.Parts;

@Controller
public class ViewBillController {
	 @Autowired
	  public BillDao BillDAO;

	  
	public BillDao getUserDAO() {
		return BillDAO;
	}
	public void setUserDAO(BillDao BillDAO) {
		this.BillDAO = BillDAO;
	}

	@RequestMapping(value = "/viewBill", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		List list=BillDAO.viewBills();
		
	    ModelAndView mav = new ModelAndView("viewbill");
	   // Iterator itr=list.iterator();
	    
	    
	    	mav.addObject("billlist",list);
	    
	    
	    return mav;
	    
	  }
	
}
