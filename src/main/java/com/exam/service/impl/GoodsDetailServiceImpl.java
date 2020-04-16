package com.exam.service.impl;

import com.exam.entity.GoodsDetail;
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

    @Override
    public GoodsDetailVo getById(Long id) {
        return goodsDetailMapper.findById(id);
    }

    @Override
    public void buyDetail(Long id, Integer buyNum) throws MyException {
        try {
            goodsDetailMapper.updateRemainingById(buyNum,id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("修改失败");
        }
    }

    @Override
    public void addDetail(GoodsDetail detail) throws MyException {
        try {
            goodsDetailMapper.insertSelective(detail);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("新增失败");
        }
    }
}
