package com.example.gas.mapper;

import java.util.List;
import com.example.gas.domain.GasStation;
import org.apache.ibatis.annotations.Mapper;

/**
 * 加油站Mapper接口
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@Mapper
public interface GasStationMapper
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
     * 删除加油站
     *
     * @param id 加油站主键
     * @return 结果
     */
    public int deleteGasStationById(Long id);

    /**
     * 批量删除加油站
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGasStationByIds(Long[] ids);
}
