package jbr.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import jbr.springmvc.model.Bill;
import jbr.springmvc.model.Parts;
import jbr.springmvc.model.User;

public interface BillDao {
	

	public void saveBill(Bill bill);
	
	public void saveParts(Parts parts);

	public List viewBills();
	public List viewBill(int billid);
	
}
