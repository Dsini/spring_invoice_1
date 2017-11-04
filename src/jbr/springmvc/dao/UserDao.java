package jbr.springmvc.dao;
import java.util.List;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
public interface UserDao {
  void saveUser(User user);
  Boolean validateUser(Login login);
}