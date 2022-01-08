package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;
import fcu.sep.fcushop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;
import java.math.BigInteger;

/**
 * The service used to access the data related to user.
 */
@Service
public class UserService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  /**
   * Register a user.
   *
   * @param newUser input user
   * @return user with given id
   */
  public User registerUser(User newUser) {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "INSERT INTO User (USERNAME, NAME, PASSWORD, EMAIL, PHONE) "
          + "VALUES (:username, :name, :password, :email, :phone)";
      System.out.println(query);
      connection.createQuery(query)
          .addParameter("username", newUser.getUsername())
          .addParameter("name", newUser.getName())
          .addParameter("password", newUser.getPassword())
          .addParameter("email", newUser.getEmail())
          .addParameter("phone", newUser.getPhone())
          .executeUpdate();
      return newUser;
    }
  }
}
