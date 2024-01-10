package com.water.supermarket.service;

import com.water.supermarket.dao.GoodsMapper;
import com.water.supermarket.pojo.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoodsService {

    /**
     * 引入Dao层
     */
    @Resource
    private GoodsMapper goodsMapper;

    public Goods selectGoodsByCode(String code) {
        /**
         * 调用dao层根据code码查询商品的方法
         */
        return goodsMapper.selectGoodsByCode(code);
    }

    /**
     * 添加商品方法
     *
     * @param goods
     * @return
     */
    public int addGoods(Goods goods) {
        /**
         * 调用dao层的新增方法
         */
        return goodsMapper.insert(goods);

    }
}
