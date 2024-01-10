package com.water.supermarket.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.water.supermarket.pojo.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * {@code @Mapper} 声明当前接口为一个Mapper接口
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
    /**
     * 根据code码查询是否有此商品
     *
     * @param code
     * @return
     */
    @Select("select * from t_goods where code = #{code}")
    Goods selectGoodsByCode(String code);

    /**
     * 新增数据
     *
     * @param goods
     * @return
     */
    @Insert("insert into t_goods(code,name,price)values(#{code},#{name},#{price})")
    int insert(Goods goods);
}

