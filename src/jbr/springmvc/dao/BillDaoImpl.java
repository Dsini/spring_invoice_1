package jbr.springmvc.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import jbr.springmvc.model.Bill;
import jbr.springmvc.model.Parts;

public class BillDaoImpl implements BillDao {

	
private HibernateTemplate hibernateTemplate;
	

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	@Transactional(readOnly = false)
	@Override
	public void saveBill(Bill bill ) {
		 hibernateTemplate.saveOrUpdate(bill);
		// TODO Auto-generated method stub
		//hibernateTemplate.save(parts);
		
			
		 }
		
	//	hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(org.hibernate.FlushMode.COMMIT);
	
	
	@Transactional(readOnly = false)
	@Override
	public void saveParts(Parts parts) {
		
		// TODO Auto-generated method stub
		hibernateTemplate.saveOrUpdate(parts);
		//hibernateTemplate.save(bill);
		hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(org.hibernate.FlushMode.COMMIT);
	
	}
	@Override
		public List viewBills() {
			// TODO Auto-generated method stub
			

		List billist = hibernateTemplate.getSessionFactory().openSession().createQuery("from Bill ").list();
		
		return billist;
		}
	@Override
	public List viewBill(int billid) {
		// TODO Auto-generated method stub
		

	Query query = hibernateTemplate.getSessionFactory().openSession().createQuery("from Bill b where b.billid = :billid");
	query.setParameter("billid",billid);
	List billist = query.list();
	return billist;
	}

}
