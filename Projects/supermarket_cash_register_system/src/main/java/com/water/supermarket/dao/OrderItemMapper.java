package com.water.supermarket.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.water.supermarket.pojo.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
}
