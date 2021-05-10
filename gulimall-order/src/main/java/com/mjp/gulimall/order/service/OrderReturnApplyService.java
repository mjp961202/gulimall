package com.mjp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjp.common.utils.PageUtils;
import com.mjp.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author minjianpeng
 * @email 18366603006@139.com
 * @date 2021-05-10 15:32:58
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

