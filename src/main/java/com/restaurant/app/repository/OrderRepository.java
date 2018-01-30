package com.restaurant.app.repository;

import com.restaurant.app.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.test.context.TestExecutionListeners;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



public interface OrderRepository extends MongoRepository<Order, String> {
    Order order = new Order();

    public void testRun();

}
