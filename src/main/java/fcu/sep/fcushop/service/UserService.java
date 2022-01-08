package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;
import fcu.sep.fcushop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.util.List;

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

    public List<User> getUsers() {
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "select USERNAME username, NAME name, PASSWORD password, EMAIL email, PHONE phone"
                    + " from User";

            return connection.createQuery(query).executeAndFetch(User.class);
        }
    }
}