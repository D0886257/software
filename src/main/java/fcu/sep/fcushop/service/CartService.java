//package fcu.sep.fcushop.service;
//
//public class CartService {
//}

package fcu.sep.fcushop.service;

import fcu.sep.fcushop.database.Sql2oDbHandler;
import fcu.sep.fcushop.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;
import java.math.BigInteger;

/**
 * The service used to access the data related to user.
 */
@Service
public class CartService {

    @Autowired
    private Sql2oDbHandler sql2oDbHandler;

    /**
     * Register a user.
     *
     * @param newCart input user
     * @return user with given id
     */
    public Cart insertCart(Cart newCart) {
        try (Connection connection = sql2oDbHandler.getConnector().open()) {
            String query = "INSERT INTO Cart (ID, NAME, IMAGE_URL, PRICE) "
                    + "VALUES (:id, :name, :url, :price)";
            System.out.println(query);
            connection.createQuery(query)
                    .addParameter("id", newCart.getId())
                    .addParameter("name", newCart.getName())
                    .addParameter("url", newCart.getUrl())
                    .addParameter("price", newCart.getPrice())
                    .executeUpdate();
            return newCart;
        }
    }
}
