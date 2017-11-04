package jbr.springmvc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;


public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	

	public void setSessionFactory(SessionFactory sessionFactory) 
    {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	@Transactional(readOnly = false)
	@Override
	public void saveUser(User user) {
		hibernateTemplate.save(user);
		hibernateTemplate.getSessionFactory().openSession().setFlushMode(org.hibernate.FlushMode.COMMIT);
	
	}
	@Transactional(readOnly = false)
	@Override
	public Boolean validateUser(Login login) {
		// TODO Auto-generated method stub
		hibernateTemplate.getSessionFactory().openSession().setFlushMode(org.hibernate.FlushMode.AUTO);
	List userlist=hibernateTemplate.find("select username, password from User as u where u.password = ? and u.username = ?",login.getPassword(),login.getUsername());
	Iterator itr = userlist.listIterator();
	if(itr.hasNext()) {
		return true;
		
	}else {
		return false;
	}
	}}