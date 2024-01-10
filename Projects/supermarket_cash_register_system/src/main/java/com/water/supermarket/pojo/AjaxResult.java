package com.water.supermarket.pojo;

import lombok.*;

@Getter // get 方法
@Setter // set 方法
@NoArgsConstructor // 无参构造
@AllArgsConstructor // 全参构造
public class AjaxResult {
    /**
     * resultCode 统一返回码
     * 一般返回值
     * ： 业务上的成功
     * ： 程序内部出错了
     */
    private Integer resultCode;
    /**
     * 操作成功或者失败的提示消息
     * 如：账号不存在，密码错误等等...
     */
    private String message;
    /**
     * 成功以后返回的数据
     * 如： 分页查询
     * 根据主键id查询，都有返回结果
     */
    private Object data;


    /**
     * 常用的方法,失败方法
     *
     * @param message
     * @return
     */
    public static AjaxResult error(String message) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.resultCode = 500;
        ajaxResult.message = message;
        return ajaxResult;
    }


    public static AjaxResult error(Integer code, String message) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.resultCode = code;
        ajaxResult.message = message;
        return ajaxResult;
    }


    /**
     * 常用方方法，成功方法
     *
     * @param data
     * @return
     */
    public static AjaxResult success(Object data) {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.resultCode = 200;
        ajaxResult.data = data;
        return ajaxResult;
    }

    public static AjaxResult success() {
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.resultCode = 200;
        return ajaxResult;
    }

}
