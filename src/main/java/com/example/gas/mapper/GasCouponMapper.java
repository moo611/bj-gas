package com.example.gas.mapper;

import java.util.List;
import com.example.gas.domain.GasCoupon;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券Mapper接口
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@Mapper
public interface GasCouponMapper
{
    /**
     * 查询优惠券
     *
     * @param code 优惠券主键
     * @return 优惠券
     */
    public GasCoupon selectGasCouponByCode(String code);

    /**
     * 查询优惠券列表
     *
     * @param gasCoupon 优惠券
     * @return 优惠券集合
     */
    public List<GasCoupon> selectGasCouponList(GasCoupon gasCoupon);

    /**
     * 新增优惠券
     *
     * @param gasCoupon 优惠券
     * @return 结果
     */
    public int insertGasCoupon(GasCoupon gasCoupon);

    /**
     * 修改优惠券
     *
     * @param gasCoupon 优惠券
     * @return 结果
     */
    public int updateGasCoupon(GasCoupon gasCoupon);

    /**
     * 删除优惠券
     *
     * @param code 优惠券主键
     * @return 结果
     */
    public int deleteGasCouponByCode(String code);

    /**
     * 批量删除优惠券
     *
     * @param codes 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGasCouponByCodes(String[] codes);
}
