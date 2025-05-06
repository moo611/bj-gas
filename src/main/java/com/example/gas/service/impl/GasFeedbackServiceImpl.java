package com.example.gas.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.gas.mapper.GasFeedbackMapper;
import com.example.gas.domain.GasFeedback;
import com.example.gas.service.IGasFeedbackService;

/**
 * 反馈Service业务层处理
 *
 * @author ruoyi
 * @date 2025-05-05
 */
@Service
public class GasFeedbackServiceImpl implements IGasFeedbackService
{
    @Autowired
    private GasFeedbackMapper gasFeedbackMapper;

    /**
     * 查询反馈
     *
     * @param id 反馈主键
     * @return 反馈
     */
    @Override
    public GasFeedback selectGasFeedbackById(Long id)
    {
        return gasFeedbackMapper.selectGasFeedbackById(id);
    }

    /**
     * 查询反馈列表
     *
     * @param gasFeedback 反馈
     * @return 反馈
     */
    @Override
    public List<GasFeedback> selectGasFeedbackList(GasFeedback gasFeedback)
    {
        return gasFeedbackMapper.selectGasFeedbackList(gasFeedback);
    }

    /**
     * 新增反馈
     *
     * @param gasFeedback 反馈
     * @return 结果
     */
    @Override
    public int insertGasFeedback(GasFeedback gasFeedback)
    {
        gasFeedback.setCreateTime(new Date());
        return gasFeedbackMapper.insertGasFeedback(gasFeedback);
    }

    /**
     * 修改反馈
     *
     * @param gasFeedback 反馈
     * @return 结果
     */
    @Override
    public int updateGasFeedback(GasFeedback gasFeedback)
    {
        gasFeedback.setUpdateTime(new Date());
        return gasFeedbackMapper.updateGasFeedback(gasFeedback);
    }

    /**
     * 批量删除反馈
     *
     * @param ids 需要删除的反馈主键
     * @return 结果
     */
    @Override
    public int deleteGasFeedbackByIds(Long[] ids)
    {
        return gasFeedbackMapper.deleteGasFeedbackByIds(ids);
    }

    /**
     * 删除反馈信息
     *
     * @param id 反馈主键
     * @return 结果
     */
    @Override
    public int deleteGasFeedbackById(Long id)
    {
        return gasFeedbackMapper.deleteGasFeedbackById(id);
    }
}
