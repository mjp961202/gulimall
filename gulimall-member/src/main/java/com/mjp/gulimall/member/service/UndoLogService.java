package com.mjp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mjp.common.utils.PageUtils;
import com.mjp.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author minjianpeng
 * @email 18366603006@139.com
 * @date 2021-05-10 15:25:22
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

