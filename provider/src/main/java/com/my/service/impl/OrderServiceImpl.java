package com.my.service.impl;

import com.my.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by neil on 2017/11/5.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    public String getName(String name) {
        return "Name of " + name;
    }

    public Integer getSize(String param) {
        return Integer.valueOf(param);
    }
}
