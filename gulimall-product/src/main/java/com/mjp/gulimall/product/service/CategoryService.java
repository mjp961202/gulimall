package com.mjp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjp.common.utils.PageUtils;
import com.mjp.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author minjianpeng
 * @email 18366603006@139.com
 * @date 2021-05-10 14:09:39
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

