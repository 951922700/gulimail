package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 16:37:19
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

