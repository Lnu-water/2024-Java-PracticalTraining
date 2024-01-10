package com.water.supermarket.controller;

import com.water.supermarket.pojo.AjaxResult;
import com.water.supermarket.pojo.OrderItem;
import com.water.supermarket.service.OrderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * 处理订单的控制器
 *
 */
@RestController
public class OrderController {
    /**
     * 引入业务层
     */
    @Resource
    private OrderService orderService;

    @RequestMapping("/api/v1/order/addOrder")
    public AjaxResult addOrder(@RequestBody List<OrderItem> orderItemList){

        System.out.println(orderItemList);
        //调用添加订单方法
        orderService.addOrder(orderItemList);

        return AjaxResult.success();
    }
}
