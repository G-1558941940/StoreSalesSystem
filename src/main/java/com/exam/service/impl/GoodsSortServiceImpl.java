package com.exam.service.impl;

import com.exam.entity.GoodsSort;
import com.exam.mapper.GoodsSortMapper;
import com.exam.service.GoodsSortService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsSortServiceImpl implements GoodsSortService {
    private final GoodsSortMapper goodsSortMapper;

    public GoodsSortServiceImpl(GoodsSortMapper goodsSortMapper) {
        this.goodsSortMapper = goodsSortMapper;
    }


    @Override
    public List<GoodsSort> getAll() {
        return goodsSortMapper.findAll();
    }
}
