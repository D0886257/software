//package fcu.sep.fcushop.controller;
//
//public class CartController {
//
//}

package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.Cart;
import fcu.sep.fcushop.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The controller used to serve the requests regarding the access of user.
 */
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * Register a user.
     *
     * @param newCart input user
     * @return user object with given id
     */
    @PostMapping("/cart")
    public Cart register(@RequestBody Cart newCart) {
        System.out.println(newCart.getName());
        newCart = cartService.insertCart(newCart);
        return newCart;
    }

}