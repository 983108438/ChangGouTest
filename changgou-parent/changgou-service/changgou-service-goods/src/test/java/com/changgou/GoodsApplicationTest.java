package com.changgou;

import com.changgou.goods.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 包名: com.changgou
 * 类名: GoodsApplicationTest
 * 用户名: Administrator
 * 当前时间: 2020/5/10 0010 下午 3:48
 * 项目名: changgou
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GoodsApplicationTest {

    @Autowired(required = false)
    private BrandMapper brandMapper;

    @Test
    public void findAll(){
        List<Brand>brands=brandMapper.selectAll();
        for (Brand brand : brands) {
            System.out.println(brand.getName());

        }

    }
}
