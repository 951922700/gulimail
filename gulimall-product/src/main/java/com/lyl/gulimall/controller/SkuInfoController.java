package com.lyl.gulimall.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyl.gulimall.entity.SkuInfoEntity;
import com.lyl.gulimall.service.SkuInfoService;
import com.lyl.common.utils.PageUtils;
import com.lyl.common.utils.R;



/**
 * sku信息
 *
 * @author lanyonglong
 * @email 951922700@qq.com
 * @date 2021-11-11 11:44:36
 */
@RestController
@RequestMapping("gulimall/pmsskuinfo")
public class SkuInfoController {
    @Autowired
    private SkuInfoService skuInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("gulimall:pmsskuinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = skuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{skuId}")
    //@RequiresPermissions("gulimall:pmsskuinfo:info")
    public R info(@PathVariable("skuId") Long skuId){
		SkuInfoEntity pmsSkuInfo = skuInfoService.getById(skuId);

        return R.ok().put("pmsSkuInfo", pmsSkuInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("gulimall:pmsskuinfo:save")
    public R save(@RequestBody SkuInfoEntity pmsSkuInfo){
		skuInfoService.save(pmsSkuInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("gulimall:pmsskuinfo:update")
    public R update(@RequestBody SkuInfoEntity pmsSkuInfo){
		skuInfoService.updateById(pmsSkuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("gulimall:pmsskuinfo:delete")
    public R delete(@RequestBody Long[] skuIds){
		skuInfoService.removeByIds(Arrays.asList(skuIds));

        return R.ok();
    }

}
