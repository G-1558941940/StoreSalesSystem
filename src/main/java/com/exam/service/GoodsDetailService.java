package com.exam.service;

import com.exam.vo.GoodsDetailVo;

import java.util.List;

public interface GoodsDetailService {
    /**
     * 获取所有的商品详细列表
     * @return 商品详细 集合
     */
    List<GoodsDetailVo> getAll();
}