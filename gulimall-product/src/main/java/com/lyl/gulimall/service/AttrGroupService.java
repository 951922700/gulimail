package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 14:56:08
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

