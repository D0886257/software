package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;
import fcu.sep.fcushop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.util.List;

@Service
public class SignUp {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public List<User> SignUp(String userName, String Account, String pwd, String mail, int phone) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "INSERT INTO USER (Username, Account, Password, Mail, Phone) VALUE (userName, Account, pwd, mail, phone)";

      return connection.createQuery(query).executeAndFetch(User.class);
    }
  }
}
