package com.exam.service;

import com.exam.exception.MyException;
import com.exam.vo.GoodsDetailVo;

import java.util.List;

public interface GoodsDetailService {
    /**
     * 获取所有的商品详细列表
     * @return 商品详细 集合
     */
    List<GoodsDetailVo> getAll();

    /**
     * 根据分类id查询商品详细集合
     * @param sortId 分类id
     * @return 商品详细集合
     */
    List<GoodsDetailVo> getBySortId(Long sortId);

    /**
     * 模糊查询商品详细集合 模糊条件（name,address）
     * @param name 商品名称
     * @param address 地址
     * @return 商品详细集合
     */
    List<GoodsDetailVo> getByVague(String name,String address);

    /**
     * 根据商品id删除商品
     * @param id 商品id
     */
    void delDetailById(Long id) throws MyException;
}