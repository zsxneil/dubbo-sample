package com.my.service.impl;

import com.my.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * Created by neil on 2017/11/5.
 */

@Service("localOrderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderService orderService;

    public String getName(String name) {
        return orderService.getName(name);
    }

    public Integer getSize(String param) {
        return orderService.getSize(param);
    }
}
