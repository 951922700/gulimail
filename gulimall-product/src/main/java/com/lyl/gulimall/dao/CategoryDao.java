package com.lyl.gulimall.dao;

import com.lyl.gulimall.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 14:56:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
