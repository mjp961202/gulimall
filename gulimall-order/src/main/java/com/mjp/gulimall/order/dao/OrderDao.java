package com.mjp.gulimall.order.dao;

import com.mjp.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author minjianpeng
 * @email 18366603006@139.com
 * @date 2021-05-10 15:32:58
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
