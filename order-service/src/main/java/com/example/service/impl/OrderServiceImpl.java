package com.example.service.impl;

import com.example.pojo.Order;
import com.example.service.OrderService;
import com.example.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * 订单服务
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    /**
     * 根据主键查询订单
     *
     * @param id
     * @return
     */
    @Override
    public Order selectOrderById(Integer id) {
        log.info("test log");
        return new Order(id, "order-001", "中国", 11776D,
                productService.selectProductListByIds(Arrays.asList(1, 2)));
    }

}