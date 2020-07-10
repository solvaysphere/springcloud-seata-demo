package com.solvay.springcloud.alibaba.service;

import com.solvay.springcloud.alibaba.domain.Order;

/**
 * @Author solvay
 * @Since 2020/3/18 21:17
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}