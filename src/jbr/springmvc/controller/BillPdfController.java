package jbr.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.dao.BillDao;

@Controller
public class BillPdfController {
 
	 @Autowired
	  public BillDao BillDAO;

	  
	public BillDao getUserDAO() {
		return BillDAO;
	}
	public void setUserDAO(BillDao BillDAO) {
		this.BillDAO = BillDAO;
	}

    /**
     * Handle request to the default page
     */
   /* @RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewHome() {
        return "home";
    }
 */
    /**
     * Handle request to download a PDF document
     */
    @RequestMapping(value = "/downloadPDF", method = RequestMethod.GET)
    public ModelAndView downloadExcel(@RequestParam("billid") int billid) {
        // create some sample data
    	System.out.println(billid);
    	List list=BillDAO.viewBill(billid);
 
        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("pdfView", "list", list);
    }
}