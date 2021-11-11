package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 11:44:36
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

