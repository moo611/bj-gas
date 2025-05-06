package com.example.gas.mapper;

import java.util.List;
import com.example.gas.domain.GasFeedback;
import org.apache.ibatis.annotations.Mapper;

/**
 * 反馈Mapper接口
 *
 * @author ruoyi
 * @date 2025-05-05
 */
@Mapper
public interface GasFeedbackMapper
{
    /**
     * 查询反馈
     *
     * @param id 反馈主键
     * @return 反馈
     */
    public GasFeedback selectGasFeedbackById(Long id);

    /**
     * 查询反馈列表
     *
     * @param gasFeedback 反馈
     * @return 反馈集合
     */
    public List<GasFeedback> selectGasFeedbackList(GasFeedback gasFeedback);

    /**
     * 新增反馈
     *
     * @param gasFeedback 反馈
     * @return 结果
     */
    public int insertGasFeedback(GasFeedback gasFeedback);

    /**
     * 修改反馈
     *
     * @param gasFeedback 反馈
     * @return 结果
     */
    public int updateGasFeedback(GasFeedback gasFeedback);

    /**
     * 删除反馈
     *
     * @param id 反馈主键
     * @return 结果
     */
    public int deleteGasFeedbackById(Long id);

    /**
     * 批量删除反馈
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGasFeedbackByIds(Long[] ids);
}
