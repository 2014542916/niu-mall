package com.niu.mall.admin.dto;

import com.niu.mall.mbg.po.OmsCompanyAddressPo;
import com.niu.mall.mbg.po.OmsOrderReturnApplyPo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * Created by macro on 2018/10/18.
 */
public class OmsOrderReturnApplyResultDto extends OmsOrderReturnApplyPo {
    @Getter
    @Setter
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddressPo companyAddress;
}
