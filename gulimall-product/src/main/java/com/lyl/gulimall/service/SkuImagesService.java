package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 11:44:36
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

