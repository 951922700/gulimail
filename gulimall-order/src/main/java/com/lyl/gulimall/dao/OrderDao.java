package com.lyl.gulimall.dao;

import com.lyl.gulimall.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 16:29:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
