package com.example.gas.domain;


import com.example.gas.domain.base.BaseEntity;

import java.math.BigDecimal;

/**
 * 商品对象 gas_product
 *
 * @author ruoyi
 * @date 2025-02-25
 */
public class GasProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 名称 */
    
    private String name;

    /** 油价 */
    
    private BigDecimal price;

    /** 加油站id */
    
    private Long stationId;

    /** 删除标识 */
    private String delFlag;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public BigDecimal getPrice()
    {
        return price;
    }
    public void setStationId(Long stationId)
    {
        this.stationId = stationId;
    }

    public Long getStationId()
    {
        return stationId;
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
