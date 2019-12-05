package com.ecommerce.supermarket.checkout.web;

import com.ecommerce.supermarket.checkout.User;
import com.ecommerce.supermarket.checkout.config.CheckoutProperties;
import com.ecommerce.supermarket.checkout.service.CheckoutService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

    @Autowired
    private CheckoutProperties checkoutProperties;

    @Autowired
    private CheckoutService checkoutService;

    @GetMapping("/greetings")
    public String getGreetings(){

        return checkoutProperties.getGreetings();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){

        return checkoutService.getUser(id);

    }
}
