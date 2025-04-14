package com.example.gas.service.impl;

import java.util.Date;
import java.util.List;

import com.example.gas.config.auth.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gas.mapper.GasStationMapper;
import com.example.gas.domain.GasStation;
import com.example.gas.service.IGasStationService;

/**
 * 加油站Service业务层处理
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@Service
public class GasStationServiceImpl implements IGasStationService
{
    @Autowired
    private GasStationMapper gasStationMapper;

    /**
     * 查询加油站
     *
     * @param id 加油站主键
     * @return 加油站
     */
    @Override
    public GasStation selectGasStationById(Long id)
    {
        return gasStationMapper.selectGasStationById(id);
    }

    /**
     * 查询加油站列表
     *
     * @param gasStation 加油站
     * @return 加油站
     */
    @Override
    public List<GasStation> selectGasStationList(GasStation gasStation)
    {
        return gasStationMapper.selectGasStationList(gasStation);
    }

    /**
     * 新增加油站
     *
     * @param gasStation 加油站
     * @return 结果
     */
    @Override
    public int insertGasStation(GasStation gasStation)
    {
        gasStation.setCreateTime(new Date());
        gasStation.setCreateBy(UserUtil.getCurrentUsername());
        return gasStationMapper.insertGasStation(gasStation);
    }

    /**
     * 修改加油站
     *
     * @param gasStation 加油站
     * @return 结果
     */
    @Override
    public int updateGasStation(GasStation gasStation)
    {
        gasStation.setUpdateTime(new Date());
        gasStation.setUpdateBy(UserUtil.getCurrentUsername());
        return gasStationMapper.updateGasStation(gasStation);
    }

    /**
     * 批量删除加油站
     *
     * @param ids 需要删除的加油站主键
     * @return 结果
     */
    @Override
    public int deleteGasStationByIds(Long[] ids)
    {
        return gasStationMapper.deleteGasStationByIds(ids);
    }

    /**
     * 删除加油站信息
     *
     * @param id 加油站主键
     * @return 结果
     */
    @Override
    public int deleteGasStationById(Long id)
    {
        return gasStationMapper.deleteGasStationById(id);
    }
}
