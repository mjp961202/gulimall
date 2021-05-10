package com.mjp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjp.common.utils.PageUtils;
import com.mjp.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author minjianpeng
 * @email 18366603006@139.com
 * @date 2021-05-10 15:25:22
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

