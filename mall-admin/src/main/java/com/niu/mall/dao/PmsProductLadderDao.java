package com.niu.mall.dao;

import com.niu.mall.po.PmsProductLadderPo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) Mapper 接口
 * </p>
 *
 * @author lihaojie
 * @since 2022-11-21
 */
@Mapper
public interface PmsProductLadderDao extends BaseMapper<PmsProductLadderPo> {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductLadderPo> productLadderList);
}
