package com.changgou.goods.controller;

import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import entity.Result;
import entity.StatusCode;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 包名: com.changgou.goods.controller
 * 类名: BrandController
 * 用户名: Administrator
 * 当前时间: 2020/5/10 0010 下午 3:19
 * 项目名: changgou
 */

@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {

    @Autowired
    private BrandService brandService;

    /***
     * 查询全部数据
     * @return
     */
//    @RequestMapping(value = "findAll",method = RequestMethod.GET)
   @GetMapping
    public List<Brand> findAll(){
        List<Brand> brands = brandService.findAll();
       new Result<List<Brand>>(true, StatusCode.OK,"查询成功",brands) ;
//       new Result<List<Brand>>(true, StatusCode.OK,)
        return brands;
    }
}