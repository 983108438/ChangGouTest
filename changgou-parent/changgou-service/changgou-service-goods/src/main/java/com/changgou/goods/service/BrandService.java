package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;

import java.util.List;

/**
 * 包名: com.changgou.goods.service
 * 类名: BrandService
 * 用户名: Administrator
 * 当前时间: 2020/5/10 0010 下午 3:18
 * 项目名: changgou
 */
public interface BrandService {

    /***
     * 查询所有品牌
     * @return
     */
    List<Brand> findAll();
}