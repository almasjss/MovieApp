package com.almasjss.TestTask.service;


import com.almasjss.TestTask.constants.Constants;
import com.almasjss.TestTask.entity.Order;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class OrderService {
    private static final HashMap<String, Order> Orders  = new HashMap<>();
    public String setOrder(Order order) {
        Orders.put(order.getOrderName(),order);
        return Constants.OK;
    }

    public String setUpdateOrder(Order order) {
        Orders.replace(order.getOrderName(),order);
        return Constants.OK;
    }

    public Order getOrder(HttpServletRequest orderId) {
        return Orders.get(orderId);
    }

    public static Map<String, Order> getOrders() {
        return Orders;
    }

    public void deleteOrder(String orderName) {
        Orders.remove(orderName);
    }
}