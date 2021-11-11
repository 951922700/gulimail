package com.lyl.gulimall.feign;

import com.lyl.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/gulimall/coupon/member/list")
    public R membercoupons();//得到一个R对象
}
