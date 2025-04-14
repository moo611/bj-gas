package com.example.gas.service;

import java.util.List;
import com.example.gas.domain.GasStation;

/**
 * 加油站Service接口
 *
 * @author ruoyi
 * @date 2025-02-25
 */
public interface IGasStationService
{
    /**
     * 查询加油站
     *
     * @param id 加油站主键
     * @return 加油站
     */
    public GasStation selectGasStationById(Long id);

    /**
     * 查询加油站列表
     *
     * @param gasStation 加油站
     * @return 加油站集合
     */
    public List<GasStation> selectGasStationList(GasStation gasStation);

    /**
     * 新增加油站
     *
     * @param gasStation 加油站
     * @return 结果
     */
    public int insertGasStation(GasStation gasStation);

    /**
     * 修改加油站
     *
     * @param gasStation 加油站
     * @return 结果
     */
    public int updateGasStation(GasStation gasStation);

    /**
     * 批量删除加油站
     *
     * @param ids 需要删除的加油站主键集合
     * @return 结果
     */
    public int deleteGasStationByIds(Long[] ids);

    /**
     * 删除加油站信息
     *
     * @param id 加油站主键
     * @return 结果
     */
    public int deleteGasStationById(Long id);
}
