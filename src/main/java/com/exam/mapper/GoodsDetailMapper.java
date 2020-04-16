package com.exam.mapper;

import com.exam.entity.GoodsDetail;
import com.exam.vo.GoodsDetailVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDetailMapper {
    /**
     * 根据商品ID查询商品明细
     * @param id 商品id
     * @return 商品明细
     */
    GoodsDetailVo findById(@Param("id")Long id);

    /**
     * 根据商品id修改商品库存数量
     * @param buyNum 购买数量
     * @param id 商品id
     * @return 影响行数
     */
    int updateRemainingById(@Param("buyNum")Integer buyNum,@Param("id")Long id);



    /**
     * 添加商品
     * @param goodsDetail 商品明细
     * @return 影响行数
     */
    int insertSelective(GoodsDetail goodsDetail);

    /**
     * 根据商品id删除商品
     * @param id 商品id
     * @return 影响行数
     */
    int deleteById(@Param("id")Long id);

    /**
     * 根据分类id查询商品集合
     * @param sortId 分类id
     * @return 商品明细集合
     */
    List<GoodsDetailVo> findBySortId(@Param("sortId")Long sortId);


    /**
     * 模糊查询商品明细  根据商品名 和 产地
     * @param likeName 商品名
     * @param likeAddress 产地
     * @return 商品明细集合
     */
	List<GoodsDetailVo> findByNameLikeAndAddressLike(@Param("likeName")String likeName,@Param("likeAddress")String likeAddress);
}