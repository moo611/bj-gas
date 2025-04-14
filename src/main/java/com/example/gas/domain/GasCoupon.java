package com.example.gas.domain;

import com.example.gas.domain.base.BaseEntity;

import java.math.BigDecimal;


/**
 * 优惠券对象 gas_coupon
 *
 * @author ruoyi
 * @date 2025-02-25
 */
public class GasCoupon extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 识别码 */
    private String code;

    /** 抵扣价 */
    
    private BigDecimal discount;

    /** 名称 */
    
    private String name;

    /** 领取人 */
    
    private String receiver;

    /** 0、未领取1、已领取2、已使用 */
    
    private String status;

    /** 删除标识 */
    private String delFlag;

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setDiscount(BigDecimal discount)
    {
        this.discount = discount;
    }

    public BigDecimal getDiscount()
    {
        return discount;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setReceiver(String receiver)
    {
        this.receiver = receiver;
    }

    public String getReceiver()
    {
        return receiver;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

 
}
