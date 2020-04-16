package com.exam.controller;

import com.exam.entity.GoodsSort;
import com.exam.service.GoodsSortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsSortController {
    private final GoodsSortService goodsSortService;

    public GoodsSortController(GoodsSortService goodsSortService) {
        this.goodsSortService = goodsSortService;
    }

    @GetMapping("/getSortList")
    public List<GoodsSort> getSortList(){
        return goodsSortService.getAll();
    }
}
