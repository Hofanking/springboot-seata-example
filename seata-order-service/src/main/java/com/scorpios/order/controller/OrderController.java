package com.scorpios.order.controller;


import com.scorpios.common.domain.Order;
import com.scorpios.common.util.CommonResult;
import com.scorpios.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController{

    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }


}

