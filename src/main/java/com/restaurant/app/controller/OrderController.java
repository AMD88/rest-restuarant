package com.restaurant.app.controller;

import com.restaurant.app.domain.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ResponseEntity<String> welcome() {//Welcome page, non-rest
//        return new ResponseEntity<>("Welcome to RestTemplate Example.", HttpStatus.OK);
//    }

    @RequestMapping("/")
    public String startMessage(){
        return "Application started";
    }

    @RequestMapping("/greeting/{msg}")
    public String startMessageRest(@PathVariable String msg){
        return msg + " welcome";
    }

    @RequestMapping("/greetingxml/{msg}")
    public Message startMessageRestXML(@PathVariable String msg){
        Message message = new Message("Hi", msg);
        return message;
    }



//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ResponseEntity<String> welcome() {//Welcome page, non-rest
//        return new ResponseEntity<>("Welcome to RestTemplate Example.", HttpStatus.OK);
//    }

//    public Message message(@PathVariable String player) {//REST Endpoint.
//
//        Message msg = new Message(player, "Hello " + player);
//        return msg;
//    }
}
