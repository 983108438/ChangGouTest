package com.changgou.goods.service.impl;

import com.changgou.goods.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 包名: com.changgou.goods.service.impl
 * 类名: BrandServiceImpl
 * 用户名: Administrator
 * 当前时间: 2020/5/10 0010 下午 3:19
 * 项目名: changgou
 */

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 全部数据
     * @return
     */
    @Override
    public List<Brand> findAll(){
        return brandMapper.selectAll();
    }
}