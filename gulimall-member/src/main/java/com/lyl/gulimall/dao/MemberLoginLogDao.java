package com.lyl.gulimall.dao;

import com.lyl.gulimall.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 16:01:16
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
