package com.restuarant.app.controller;

public class OrderController {

    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

//    public Message message(@PathVariable String player) {//REST Endpoint.
//
//        Message msg = new Message(player, "Hello " + player);
//        return msg;
//    }
}
