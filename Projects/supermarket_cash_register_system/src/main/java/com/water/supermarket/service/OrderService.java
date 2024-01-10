package com.water.supermarket.service;

import com.water.supermarket.dao.OrderItemMapper;
import com.water.supermarket.dao.OrderMapper;
import com.water.supermarket.pojo.Order;
import com.water.supermarket.pojo.OrderItem;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    //引入订单mapper
    @Resource
    private OrderMapper orderMapper;


    //引入订单明细mapper
    @Resource
    private OrderItemMapper orderItemMapper;

    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println("time = " + time);
    }

    /**
     * 新增订单业务，当前业务方法有多条sql，先保存订单，再保存订单明细
     *
     * @param orderItemL ist
     */
    @Transactional //事务处理注解
    public void addOrder(List<OrderItem> orderItemList) {
        //创建订单对象
        Order order = new Order();
        //使用时间戳作为订单编号
        Date date = new Date();
        Long time = date.getTime();
        order.setOrderNumber(time);
        //计算总价=循环+（每个商品的单价*购买数量）
        double totalPrice = 0;
        for (OrderItem orderItem : orderItemList) {
            totalPrice += orderItem.getBuyNum() * orderItem.getPrice();
        }
        //设置总价
        order.setTotalPrice(totalPrice);

        System.out.println("插入前 = " + order);
        //调用dao层的保存方法
        orderMapper.insert(order);

        //获取插入订单以后数据库生成的主键,作为订单明细的order_id
        System.out.println("插入后 = " + order);
        for (OrderItem orderItem : orderItemList) {
            //分别设置每个订单明细的订单id
            orderItem.setOrderId(order.getId());
            System.out.println("orderItem = " + orderItem);

            //保存订单明细到数据库
            orderItemMapper.insert(orderItem);

        }
    }
}
