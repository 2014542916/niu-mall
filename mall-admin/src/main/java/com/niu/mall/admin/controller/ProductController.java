package com.niu.mall.admin.controller;


import com.niu.mall.admin.service.impl.ProductServiceImpl;
import com.niu.mall.common.api.Result;
import com.niu.mall.mbg.domain.ProductDomain;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 商品基本信息 前端控制器
 * </p>
 *
 * @author lihaojie
 * @since 2022-08-31
 */
@RestController
@RequestMapping("/productDomain")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    /**
     *  创建商品
     *   形参：ProductParamDto
     */
    @ApiOperation("创建商品控制类")
    @PostMapping(value = "/product")
    public Result create(@ApiParam("商品参数") @RequestBody ProductDomain product) {

        return productService.createProduct(product);
    }

    /**
     * 更新商品
     * @Param：id
     * */
    @ApiOperation("更新商品控制类")
    @PutMapping(value = "/product")
    public Result update( @RequestBody ProductDomain product) {
        Result update = productService.update(product);
        return update;
    }

    /**
     * @description: 删除方法
     * @param: id
     * @return:  void
     * @author Administrator
     * @date: 2022/5/30 15:56
     */
    @DeleteMapping("/product/{id}")
    public String delete(@PathVariable Integer id){

        return null;
    }

    @ApiOperation("查询商品控制类")
    @GetMapping(value = "/product/{id}")
    public Result getByProductId(@PathVariable long id) {
        return  productService.getByProductId(id);
    }

}
