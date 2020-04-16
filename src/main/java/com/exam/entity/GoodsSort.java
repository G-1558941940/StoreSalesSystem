package com.exam.entity;

/**
 * 商品分类表
 */
public class GoodsSort {
    /**
     * 分类编号
     */
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}