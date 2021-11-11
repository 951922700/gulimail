package com.lyl.gulimall.dao;

import com.lyl.gulimall.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 16:01:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
