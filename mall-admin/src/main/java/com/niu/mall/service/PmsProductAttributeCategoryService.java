package com.niu.mall.service;

import com.niu.mall.dto.PmsProductAttributeCategoryDto;
import com.niu.mall.po.PmsProductAttributeCategoryPo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author lihaojie
 * @since 2022-11-21
 */
public interface PmsProductAttributeCategoryService extends IService<PmsProductAttributeCategoryPo> {


    /**
     * 分页查询属性分类
     *
     * @author lihaojie
     * @date 2022/12/10 21:39
     * @param pageNum
     * @param pageSize
     * @return java.util.List<PmsProductAttributeCategoryPo>
     */

    List<PmsProductAttributeCategoryPo> getAll(Integer pageNum, Integer pageSize);
    /**
     * 获取包含属性的属性分类
     *
     * @author lihaojie
     * @date 2022/12/10 21:39
     * @return java.util.List<PmsProductAttributeCategoryDto>
     */
    List<PmsProductAttributeCategoryDto> getListWithAttr();

}
