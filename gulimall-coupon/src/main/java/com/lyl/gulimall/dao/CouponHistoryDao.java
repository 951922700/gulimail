package com.lyl.gulimall.dao;

import com.lyl.gulimall.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 15:30:55
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
