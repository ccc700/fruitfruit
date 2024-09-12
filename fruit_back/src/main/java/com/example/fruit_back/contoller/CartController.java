package com.example.fruit_back.contoller;

import com.example.fruit_back.entity.Cart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @GetMapping("/list")
    public Cart cartList(){
        Cart myCart=new Cart();
        myCart.setNo(1);
        myCart.setQty(2);
        return myCart;
    }

}
