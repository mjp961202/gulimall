package com.mjp.gulimall.member.dao;

import com.mjp.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author minjianpeng
 * @email 18366603006@139.com
 * @date 2021-05-10 15:25:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
