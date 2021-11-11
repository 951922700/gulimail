package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 14:56:08
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

