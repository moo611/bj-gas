package com.example.gas.service;

import java.util.List;
import com.example.gas.domain.GasProduct;

/**
 * 商品Service接口
 *
 * @author ruoyi
 * @date 2025-02-25
 */
public interface IGasProductService
{
    /**
     * 查询商品
     *
     * @param id 商品主键
     * @return 商品
     */
    public GasProduct selectGasProductById(Long id);

    /**
     * 查询商品列表
     *
     * @param gasProduct 商品
     * @return 商品集合
     */
    public List<GasProduct> selectGasProductList(GasProduct gasProduct);

    /**
     * 新增商品
     *
     * @param gasProduct 商品
     * @return 结果
     */
    public int insertGasProduct(GasProduct gasProduct);

    /**
     * 修改商品
     *
     * @param gasProduct 商品
     * @return 结果
     */
    public int updateGasProduct(GasProduct gasProduct);

    /**
     * 批量删除商品
     *
     * @param ids 需要删除的商品主键集合
     * @return 结果
     */
    public int deleteGasProductByIds(Long[] ids);

    /**
     * 删除商品信息
     *
     * @param id 商品主键
     * @return 结果
     */
    public int deleteGasProductById(Long id);
}
