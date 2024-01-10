package com.water.supermarket.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

@TableName("t_order")
@Getter // get 方法
@Setter // set 方法
@NoArgsConstructor // 无参构造
@AllArgsConstructor // 全参构造
public class Order {
    //MyBatisPlus框架主键映射注解
    @TableId(type = IdType.AUTO)
    private Integer id;//主键
    private Long orderNumber;//订单编号一般使用时间戳
    private Double totalPrice;//总价
    private Date createDate;//订单事件

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", totalPrice=" + totalPrice +
                ", createDate=" + createDate +
                '}';
    }
}
