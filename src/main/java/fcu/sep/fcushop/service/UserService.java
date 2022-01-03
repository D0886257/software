package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;
import fcu.sep.fcushop.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;



@Service
public class UserService {

  @Autowired
  private Sql2oDbHandler sql2oDbHandler;

  public UserService() {

  }



  public List<User> getUser() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String sql = "INSERT INTO User VALUES ('Pomelo','Andrew','abc123','123@gmail.com','094155765' )";


      return connection.createQuery(sql).executeAndFetch(User.class);
    }
  }




}

