package com.exam.mapper;

import com.exam.entity.GoodsSort;

import java.util.List;

public interface GoodsSortMapper {
    /**
     * 查询所有商品分类
     * @return 商品分类集合
     */
    List<GoodsSort> findAll();
}