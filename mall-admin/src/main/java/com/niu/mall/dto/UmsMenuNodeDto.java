package com.niu.mall.dto;

import com.niu.mall.po.UmsMenuPo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 后台菜单节点封装
 *
 * @author lihaojie
 * @date 2023/01/02 14:48
 **/
@Getter
@Setter
public class UmsMenuNodeDto extends UmsMenuPo {
    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNodeDto> children;
}
