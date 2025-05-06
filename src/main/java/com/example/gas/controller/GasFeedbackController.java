package com.example.gas.controller;

import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.example.gas.domain.GasFeedback;
import com.example.gas.domain.base.AjaxResult;
import com.example.gas.domain.base.R;
import com.example.gas.domain.req.GasFeedbackListReq;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gas.domain.GasFeedback;
import com.example.gas.service.IGasFeedbackService;


/**
 * 反馈Controller
 *
 * @author ruoyi
 * @date 2025-05-05
 */
@RestController
@RequestMapping("/feedback")
public class GasFeedbackController extends BaseController
{
    @Autowired
    private IGasFeedbackService gasFeedbackService;

    /**
     * 查询反馈列表
     */
    
    @GetMapping("/list")
    public R list(GasFeedbackListReq gasFeedbackListReq)
    {
        PageHelper.startPage(gasFeedbackListReq.getPageNum(), gasFeedbackListReq.getPageSize());
        GasFeedback gasFeedback = new GasFeedback();
        BeanUtils.copyProperties(gasFeedbackListReq, gasFeedback);

        List<GasFeedback> gasFeedbacks = gasFeedbackService.selectGasFeedbackList(gasFeedback);
        if (gasFeedbacks.size() > 0) {
            PageInfo<GasFeedback> pageInfo = new PageInfo<>(gasFeedbacks);
            return R.ok(pageInfo);
        }
        return R.ok(new PageInfo<GasFeedback>(Collections.emptyList()));
    }

  

    /**
     * 获取反馈详细信息
     */
    
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(gasFeedbackService.selectGasFeedbackById(id));
    }

    /**
     * 新增反馈
     */
    
    
    @PostMapping
    public AjaxResult add(@RequestBody GasFeedback gasFeedback)
    {
        return toAjax(gasFeedbackService.insertGasFeedback(gasFeedback));
    }

    /**
     * 修改反馈
     */
    
    
    @PutMapping
    public AjaxResult edit(@RequestBody GasFeedback gasFeedback)
    {
        return toAjax(gasFeedbackService.updateGasFeedback(gasFeedback));
    }

    /**
     * 删除反馈
     */
    
    
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(gasFeedbackService.deleteGasFeedbackByIds(ids));
    }
}
