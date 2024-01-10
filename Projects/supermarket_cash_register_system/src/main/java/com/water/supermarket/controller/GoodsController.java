package com.water.supermarket.controller;

import com.water.supermarket.pojo.AjaxResult;
import com.water.supermarket.pojo.Goods;
import com.water.supermarket.service.GoodsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GoodsController {


    /**
     * 引入Service层
     */

    @Resource
    private GoodsService goodsService;


    @RequestMapping("/api/v1/goods/getByCode")
    public AjaxResult getByCode(String code) {
        System.out.println("code = " + code);

        //调用Service层的查询方法
        Goods goods = goodsService.selectGoodsByCode(code);
        System.out.println("goods = " + goods);
        if (goods != null) {
            return AjaxResult.success(goods);
        }

        return AjaxResult.error(404, "商品编码不存在，请重新扫描");
    }

    @RequestMapping("/api/v1/goods/addGoods")
    public AjaxResult addGoods(@RequestBody Goods goods) {

        System.out.println(goods);

        /**
         * 调用业务层的添加商品方法
         */
        int rows = goodsService.addGoods(goods);
        if (rows == 1) {
            return AjaxResult.success();
        }

        return AjaxResult.error("添加商品失败");

    }
}
