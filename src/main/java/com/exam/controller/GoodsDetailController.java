package com.exam.controller;

import com.exam.entity.GoodsDetail;
import com.exam.exception.MyException;
import com.exam.service.GoodsDetailService;
import com.exam.vo.GoodsDetailVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/getDetailBySortId")
    public List<GoodsDetailVo> getDetailBySortId(Long sortId) {
        return goodsDetailService.getBySortId(sortId == -1 ? null : sortId);
    }

    @GetMapping("/getDetailByVague")
    public List<GoodsDetailVo> getDetailByVague(String name,String address){
        return goodsDetailService.getByVague(name,address);
    }

    @PostMapping("/delDetail")
    public Map<String,Object> delDetail(Long detailId){
        Map<String,Object> result = new HashMap<>();
        try {
            goodsDetailService.delDetailById(detailId);
            result.put("state",0);
            result.put("messages","删除成功");
        } catch (MyException e) {
            e.printStackTrace();
            result.put("state",1);
            result.put("messages","删除失败");
        }
        return result;
    }

    @GetMapping("/detailById")
    public GoodsDetailVo detailById(Long id){
        return goodsDetailService.getById(id);
    }

    @PostMapping("/buyDetail")
    public Map<String, Object> buyDetail(Long id,Integer buyNum){
        Map<String,Object> result = new HashMap<>();
        try {
            goodsDetailService.buyDetail(id,buyNum);
            result.put("state",0);
            result.put("messages","修改成功");
        } catch (MyException e) {
            e.printStackTrace();
            result.put("state",1);
            result.put("messages","修改失败");
        }
        return result;
    }

    @PostMapping("/addDetail")
    public Map<String, Object> add(GoodsDetail detail){
        Map<String,Object> result = new HashMap<>();
        try {
            goodsDetailService.addDetail(detail);
            result.put("state",0);
            result.put("messages","添加成功");
        } catch (MyException e) {
            e.printStackTrace();
            result.put("state",1);
            result.put("messages","添加失败");
        }
        return result;
    }
}
