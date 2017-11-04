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
public class CreateBillController {
	 @Autowired
	  public BillDao BillDAO;

	  
	public BillDao getUserDAO() {
		return BillDAO;
	}
	public void setUserDAO(BillDao BillDAO) {
		this.BillDAO = BillDAO;
	}

	@RequestMapping(value = "/createBill", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("createbill");
	    mav.addObject("bill", new Bill());
	    return mav;
	  }
	@RequestMapping(value = "/createBillProcesses", method = RequestMethod.POST)
	  public ModelAndView billProcess(HttpServletRequest request, HttpServletResponse response,HttpSession session,
	  @ModelAttribute("bill") Bill bill ) {
	    ModelAndView mav = null;
	    ArrayList<Parts> list = new ArrayList<>();
	    String [] desofgood = request.getParameterValues("desofgood");
		  String [] partqty = request.getParameterValues("partqty");
		  String [] hsncode = request.getParameterValues("hsncode");
		  String [] partnumber = request.getParameterValues("partnumber");
		  String [] partprice = request.getParameterValues("partprice");
	  for(int i=0;i<desofgood.length;i++) {
		  Parts parts = new Parts();
		  parts.setDesofgood(desofgood[i]);
		  parts.setPartqty(partqty[i]);
		  parts.setHsncode(hsncode[i]);
        parts.setPartnumber(partnumber[i]);
parts.setPartprice(partprice[i]);
System.out.println(desofgood[i]);
		  System.out.println(partqty[i]);
		  System.out.println(hsncode[i]);
		  System.out.println(partnumber[i]);
		  System.out.println(partprice[i]);
		  parts.setBill(bill);

		  list.add(parts);
		  
		 // System.out.println(parts.getBillid());
	  }
	  bill.setPartslist(list);
	  
	  
	   // List<Parts> list =  bill.getPartslist();   
	    BillDAO.saveBill(bill);
	 
	  //  ArrayList<Parts> list = new ArrayList<>();
	    
	 

	    //BillDao billdao = new BillDao();
	   // Parts parts = bill.getParts();
	   /* System.out.println(bill.getCustomername());
	  //  List<Parts> list =  bill.getPartslist();
	   ArrayList<Parts> list = new ArrayList<>();
	Iterator<Parts> itr=list.iterator();
	while(itr.hasNext()) {
		
	//	BillDAO.saveParts(itr.next());
	}
	    
	//   ArrayList<Parts> list = new ArrayList<>();
	   
	  
	    //  ArrayList<Parts> list = new ArrayList<>();
	   String [] desofgood = request.getParameterValues("part.desofgood");
		  String [] partqty = request.getParameterValues("part.partqty");
		  String [] hsncode = request.getParameterValues("part.hsncode");
		  String [] partnumber = request.getParameterValues("part.partnumber");
		  String [] partprice = request.getParameterValues("part.partprice");
	  for(int i=0;i<desofgood.length;i++) {
		  Parts parts = new Parts();
		  parts.setDesofgood(desofgood[i]);
		  parts.setPartqty(partqty[i]);
		  parts.setHsncode(hsncode[i]);
          parts.setPartnumber(partnumber[i]);
parts.setPartprice(partprice[i]);
System.out.println(desofgood[i]);
		  System.out.println(partqty[i]);
		  System.out.println(hsncode[i]);
		  System.out.println(partnumber[i]);
		  System.out.println(partprice[i]);
		  
		  list.add(parts);
	  }
	 // bill.setPartslist(list);
	  BillDAO.saveBill(bill);
	  
	  for(int i=0;i<desofgood.length;i++) {
		  Parts parts = new Parts();
		  parts.setDesofgood(desofgood[i]);
		  parts.setPartqty(partqty[i]);
		  parts.setHsncode(hsncode[i]);
          parts.setPartnumber(partnumber[i]);
parts.setPartprice(partprice[i]);
System.out.println(desofgood[i]);
		  System.out.println(partqty[i]);
		  System.out.println(hsncode[i]);
		  System.out.println(partnumber[i]);
		  System.out.println(partprice[i]);
		 // BillDAO.saveParts(parts);
	  }
	  //bill.setPartslist(list);
	  
	  
	    //list.add(parts);
	    //Iterator itr = list.iterator();
	    //while(itr.hasNext())
	    //{
	    	//System.out.println(itr.next());
	    //}
	  //  Parts objects=parts;
	   // int i=1;
	    //System.out.println(i+" "+parts.getDesofgood());
	  //i++;
	   ArrayList<Parts> list = bill.getPartslist();
	  Iterator itr= list.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }

			 
			  
			  
			 
	   // System.out.println(part.getDesofgood());
*/	    mav = new ModelAndView("createdbill");
	    return mav;
	  }
}
