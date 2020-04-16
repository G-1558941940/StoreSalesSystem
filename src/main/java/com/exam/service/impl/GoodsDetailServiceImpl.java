package com.exam.service.impl;

import com.exam.mapper.GoodsDetailMapper;
import com.exam.service.GoodsDetailService;
import com.exam.vo.GoodsDetailVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsDetailServiceImpl implements GoodsDetailService {
    private final GoodsDetailMapper goodsDetailMapper;

    public GoodsDetailServiceImpl(GoodsDetailMapper goodsDetailMapper) {
        this.goodsDetailMapper = goodsDetailMapper;
    }

    @Override
    public List<GoodsDetailVo> getAll() {
        return goodsDetailMapper.findBySortId(null);
    }
}
