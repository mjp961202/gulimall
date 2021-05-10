package com.mjp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjp.common.utils.PageUtils;
import com.mjp.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author minjianpeng
 * @email 18366603006@139.com
 * @date 2021-05-10 14:09:39
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

