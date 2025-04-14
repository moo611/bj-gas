package com.example.gas.service.impl;

import java.util.Date;
import java.util.List;

import com.example.gas.config.auth.UserUtil;
import com.example.gas.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gas.mapper.GasCouponMapper;
import com.example.gas.domain.GasCoupon;
import com.example.gas.service.IGasCouponService;

/**
 * 优惠券Service业务层处理
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@Service
public class GasCouponServiceImpl implements IGasCouponService
{
    @Autowired
    private GasCouponMapper gasCouponMapper;

    /**
     * 查询优惠券
     *
     * @param code 优惠券主键
     * @return 优惠券
     */
    @Override
    public GasCoupon selectGasCouponByCode(String code)
    {
        return gasCouponMapper.selectGasCouponByCode(code);
    }

    /**
     * 查询优惠券列表
     *
     * @param gasCoupon 优惠券
     * @return 优惠券
     */
    @Override
    public List<GasCoupon> selectGasCouponList(GasCoupon gasCoupon)
    {
        return gasCouponMapper.selectGasCouponList(gasCoupon);
    }

    /**
     * 新增优惠券
     *
     * @param gasCoupon 优惠券
     * @return 结果
     */
    @Override
    public int insertGasCoupon(GasCoupon gasCoupon)
    {
        gasCoupon.setCreateTime(new Date());
        gasCoupon.setCode(UUIDUtil.get16UUID());
        gasCoupon.setCreateBy(UserUtil.getCurrentUsername());
        return gasCouponMapper.insertGasCoupon(gasCoupon);
    }

    /**
     * 修改优惠券
     *
     * @param gasCoupon 优惠券
     * @return 结果
     */
    @Override
    public int updateGasCoupon(GasCoupon gasCoupon)
    {
        gasCoupon.setUpdateTime(new Date());
        gasCoupon.setUpdateBy(UserUtil.getCurrentUsername());
        return gasCouponMapper.updateGasCoupon(gasCoupon);
    }

    /**
     * 批量删除优惠券
     *
     * @param codes 需要删除的优惠券主键
     * @return 结果
     */
    @Override
    public int deleteGasCouponByCodes(String[] codes)
    {
        return gasCouponMapper.deleteGasCouponByCodes(codes);
    }

    /**
     * 删除优惠券信息
     *
     * @param code 优惠券主键
     * @return 结果
     */
    @Override
    public int deleteGasCouponByCode(String code)
    {
        return gasCouponMapper.deleteGasCouponByCode(code);
    }
}
