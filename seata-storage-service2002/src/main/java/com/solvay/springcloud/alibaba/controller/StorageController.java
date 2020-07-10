package com.solvay.springcloud.alibaba.controller;

import com.solvay.springcloud.alibaba.domain.CommonResult;
import com.solvay.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author solvay
 * @Since 2020/3/18 22:35
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功!");
    }
}
