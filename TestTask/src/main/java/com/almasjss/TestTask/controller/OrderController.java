package com.almasjss.TestTask.controller;

import com.almasjss.TestTask.entity.Order;
import com.almasjss.TestTask.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

// прием заявок
    @PostMapping("/create")
    public ResponseEntity createOrder(@RequestBody Order order) {
        String result = orderService.setOrder(order);
        return ResponseEntity.ok(order.getOrderName());
    }
//выдача списка новостей
    @GetMapping("/list")
    public ResponseEntity<?> getAllOrders() {
        return ResponseEntity.ok(OrderService.getOrders());
    }
    //редактирование
    @PostMapping("/edit")
    public ResponseEntity edit(@RequestBody Order order) {
        String result = orderService.setUpdateOrder(order);
        return ResponseEntity.ok("Your order is updated!");
    }
    //удаление
    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestBody String orderName)  {
        orderService.deleteOrder(orderName);
        return ResponseEntity.ok("You order is deleted!");
    }
}





