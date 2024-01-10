package com.water.supermarket.dao;
import java.util.Date;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.water.supermarket.pojo.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Insert("insert into t_order(order_number,total_price,create_date)value(#{orderNumber},#{totalPrice},now())")
    @Options(keyColumn = "id", keyProperty = "id", useGeneratedKeys = true)
    int insert(Order order);

}
