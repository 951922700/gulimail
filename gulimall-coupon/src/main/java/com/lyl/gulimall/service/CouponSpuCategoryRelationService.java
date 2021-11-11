package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 15:30:55
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

