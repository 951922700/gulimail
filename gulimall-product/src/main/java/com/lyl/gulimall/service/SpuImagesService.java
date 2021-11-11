package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 11:44:36
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

