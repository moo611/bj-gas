package com.example.gas.service.impl;

import java.util.Date;
import java.util.List;

import com.example.gas.config.auth.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gas.mapper.GasProductMapper;
import com.example.gas.domain.GasProduct;
import com.example.gas.service.IGasProductService;

/**
 * 商品Service业务层处理
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@Service
public class GasProductServiceImpl implements IGasProductService
{
    @Autowired
    private GasProductMapper gasProductMapper;

    /**
     * 查询商品
     *
     * @param id 商品主键
     * @return 商品
     */
    @Override
    public GasProduct selectGasProductById(Long id)
    {
        return gasProductMapper.selectGasProductById(id);
    }

    /**
     * 查询商品列表
     *
     * @param gasProduct 商品
     * @return 商品
     */
    @Override
    public List<GasProduct> selectGasProductList(GasProduct gasProduct)
    {
        return gasProductMapper.selectGasProductList(gasProduct);
    }

    /**
     * 新增商品
     *
     * @param gasProduct 商品
     * @return 结果
     */
    @Override
    public int insertGasProduct(GasProduct gasProduct)
    {
        gasProduct.setCreateTime(new Date());
        gasProduct.setCreateBy(UserUtil.getCurrentUsername());
        return gasProductMapper.insertGasProduct(gasProduct);
    }

    /**
     * 修改商品
     *
     * @param gasProduct 商品
     * @return 结果
     */
    @Override
    public int updateGasProduct(GasProduct gasProduct)
    {
        gasProduct.setUpdateTime(new Date());
        gasProduct.setUpdateBy(UserUtil.getCurrentUsername());
        return gasProductMapper.updateGasProduct(gasProduct);
    }

    /**
     * 批量删除商品
     *
     * @param ids 需要删除的商品主键
     * @return 结果
     */
    @Override
    public int deleteGasProductByIds(Long[] ids)
    {
        return gasProductMapper.deleteGasProductByIds(ids);
    }

    /**
     * 删除商品信息
     *
     * @param id 商品主键
     * @return 结果
     */
    @Override
    public int deleteGasProductById(Long id)
    {
        return gasProductMapper.deleteGasProductById(id);
    }
}
