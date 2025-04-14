package com.example.gas.controller;

import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.example.gas.domain.base.AjaxResult;
import com.example.gas.domain.base.R;
import com.example.gas.domain.req.GasProductListReq;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gas.domain.GasProduct;
import com.example.gas.service.IGasProductService;


/**
 * 商品Controller
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@RestController
@RequestMapping("/product")
public class GasProductController extends BaseController
{
    @Autowired
    private IGasProductService gasProductService;

    /**
     * 查询商品列表
     */
    
    @GetMapping("/list")
    public R list(GasProductListReq gasProductListReq)
    {
        PageHelper.startPage(gasProductListReq.getPageNum(), gasProductListReq.getPageSize());
        GasProduct gasProduct = new GasProduct();
        BeanUtils.copyProperties(gasProductListReq, gasProduct);

        List<GasProduct> gasProducts = gasProductService.selectGasProductList(gasProduct);
        if (gasProducts.size() > 0) {
            PageInfo<GasProduct> pageInfo = new PageInfo<>(gasProducts);
            return R.ok(pageInfo);
        }
        return R.ok(new PageInfo<GasProduct>(Collections.emptyList()));
    }

  

    /**
     * 获取商品详细信息
     */
    
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(gasProductService.selectGasProductById(id));
    }

    /**
     * 新增商品
     */
    
    
    @PostMapping
    public AjaxResult add(@RequestBody GasProduct gasProduct)
    {
        return toAjax(gasProductService.insertGasProduct(gasProduct));
    }

    /**
     * 修改商品
     */
    
    
    @PutMapping
    public AjaxResult edit(@RequestBody GasProduct gasProduct)
    {
        return toAjax(gasProductService.updateGasProduct(gasProduct));
    }

    /**
     * 删除商品
     */
    
    
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(gasProductService.deleteGasProductByIds(ids));
    }
}
