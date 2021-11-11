package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 16:37:19
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

