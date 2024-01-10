package com.water.supermarket.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@TableName("t_order_item")
@Getter // get 方法
@Setter // set 方法
@NoArgsConstructor // 无参构造
@AllArgsConstructor // 全参构造
public class OrderItem {
    @TableId(type = IdType.AUTO)
    private Integer orderId;//订单id（数据保存数据以后生成的数据）
    private String name;//商品名称
    private Double price;//商品单价
    private Integer buyNum;//购买数量
    private String code;//商品码

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderId=" + orderId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", buynum=" + buyNum +
                ", code='" + code + '\'' +
                '}';
    }
}
