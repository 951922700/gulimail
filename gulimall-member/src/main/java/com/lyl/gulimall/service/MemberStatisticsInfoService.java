package com.lyl.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lyl.common.utils.PageUtils;
import com.lyl.gulimall.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 16:01:16
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

