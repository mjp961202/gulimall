package com.mjp.gulimall.product;

import com.mjp.gulimall.product.dao.BrandDao;
import com.mjp.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Resource
    private BrandDao brandDao;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setName("测试");
//        brandService.save(brandEntity);
        brandDao.deleteById(6);
    }

}
