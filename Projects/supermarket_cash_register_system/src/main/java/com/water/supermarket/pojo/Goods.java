package com.water.supermarket.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@TableName("t_goods")
@Getter // get 方法
@Setter // set 方法
@NoArgsConstructor // 无参构造
@AllArgsConstructor // 全参构造
public class Goods {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Double price;
    private String code; // 商品的 code 码

    @Override
    public String toString() {
        return "Goods{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", code='" + code + '\'' + '}';
    }

}