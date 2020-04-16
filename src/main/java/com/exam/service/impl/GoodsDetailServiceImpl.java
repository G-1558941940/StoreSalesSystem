package com.exam.service.impl;

import com.exam.exception.MyException;
import com.exam.mapper.GoodsDetailMapper;
import com.exam.service.GoodsDetailService;
import com.exam.vo.GoodsDetailVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Throwable.class, timeout = 5000)
public class GoodsDetailServiceImpl implements GoodsDetailService {
    private final GoodsDetailMapper goodsDetailMapper;

    public GoodsDetailServiceImpl(GoodsDetailMapper goodsDetailMapper) {
        this.goodsDetailMapper = goodsDetailMapper;
    }

    @Override
    public List<GoodsDetailVo> getAll() {
        return goodsDetailMapper.findBySortId(null);
    }

    @Override
    public List<GoodsDetailVo> getBySortId(Long sortId) {
        return goodsDetailMapper.findBySortId(sortId);
    }

    @Override
    public List<GoodsDetailVo> getByVague(String name, String address) {
        return goodsDetailMapper.findByNameLikeAndAddressLike(name,address);
    }

    @Override
    public void delDetailById(Long id) throws MyException {
        try {
            goodsDetailMapper.deleteById(id);
        } catch (Exception e) {
            throw new MyException("删除失败！");
        }
    }
}
