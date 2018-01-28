package com.restaurant.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

//    public Message message(@PathVariable String player) {//REST Endpoint.
//
//        Message msg = new Message(player, "Hello " + player);
//        return msg;
//    }
}
