package com.niu.mall.dao;

import com.niu.mall.dto.PmsProductAttributeCategoryDto;
import com.niu.mall.po.PmsProductAttributeCategoryPo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 产品属性分类表 Mapper 接口
 * </p>
 *
 * @author lihaojie
 * @since 2022-11-21
 */
@Mapper
public interface PmsProductAttributeCategoryDao extends BaseMapper<PmsProductAttributeCategoryPo> {

    List<PmsProductAttributeCategoryDto> getListWithAttr();
}
