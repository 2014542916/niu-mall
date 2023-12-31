package com.niu.mall.dao;

import com.niu.mall.po.SmsCouponHistoryPo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 优惠券使用、领取历史表 Mapper 接口
 * </p>
 *
 * @author lihaojie
 * @since 2022-11-21
 */
@Mapper
public interface SmsCouponHistoryDao extends BaseMapper<SmsCouponHistoryPo> {

}
