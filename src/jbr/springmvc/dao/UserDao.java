package jbr.springmvc.dao;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
public interface UserDao {
  void saveUser(User user);
  User validateUser(Login login);
}