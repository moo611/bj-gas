package com.example.gas.mapper;

import java.util.List;
import com.example.gas.domain.GasProduct;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品Mapper接口
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@Mapper
public interface GasProductMapper
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
     * 删除商品
     *
     * @param id 商品主键
     * @return 结果
     */
    public int deleteGasProductById(Long id);

    /**
     * 批量删除商品
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGasProductByIds(Long[] ids);
}
