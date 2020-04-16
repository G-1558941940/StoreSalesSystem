package com.exam.service;

import com.exam.entity.GoodsSort;

import java.util.List;

public interface GoodsSortService {
    /**
     * 获取所有的商品分类
     * @return 商品分类集合
     */
    List<GoodsSort> getAll();
}