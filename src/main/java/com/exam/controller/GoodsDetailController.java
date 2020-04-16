package com.exam.controller;

import com.exam.service.GoodsDetailService;
import com.exam.vo.GoodsDetailVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsDetailController {
    private final GoodsDetailService goodsDetailService;

    public GoodsDetailController(GoodsDetailService goodsDetailService) {
        this.goodsDetailService = goodsDetailService;
    }

    @GetMapping("/getDetailAll")
    public List<GoodsDetailVo> getDetailAll() {
        return goodsDetailService.getAll();
    }
}
