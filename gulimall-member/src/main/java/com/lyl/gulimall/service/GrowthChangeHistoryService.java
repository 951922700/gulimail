package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 16:01:16
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

