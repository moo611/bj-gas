package com.example.gas.controller;

import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.example.gas.domain.GasStation;
import com.example.gas.domain.base.AjaxResult;
import com.example.gas.domain.base.R;
import com.example.gas.domain.req.GasStationListReq;
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

import com.example.gas.domain.GasStation;
import com.example.gas.service.IGasStationService;


/**
 * 加油站Controller
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@RestController
@RequestMapping("/station")
public class GasStationController extends BaseController
{
    @Autowired
    private IGasStationService gasStationService;

    /**
     * 查询加油站列表
     */
    
    @GetMapping("/list")
    public R list(GasStationListReq gasStationListReq)
    {
        PageHelper.startPage(gasStationListReq.getPageNum(), gasStationListReq.getPageSize());
        GasStation gasStation = new GasStation();
        BeanUtils.copyProperties(gasStationListReq, gasStation);

        List<GasStation> gasStations = gasStationService.selectGasStationList(gasStation);
        if (gasStations.size() > 0) {
            PageInfo<GasStation> pageInfo = new PageInfo<>(gasStations);
            return R.ok(pageInfo);
        }
        return R.ok(new PageInfo<GasStation>(Collections.emptyList()));
    }

  

    /**
     * 获取加油站详细信息
     */
    
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(gasStationService.selectGasStationById(id));
    }

    /**
     * 新增加油站
     */
    
    
    @PostMapping
    public AjaxResult add(@RequestBody GasStation gasStation)
    {
        return toAjax(gasStationService.insertGasStation(gasStation));
    }

    /**
     * 修改加油站
     */
    
    
    @PutMapping
    public AjaxResult edit(@RequestBody GasStation gasStation)
    {
        return toAjax(gasStationService.updateGasStation(gasStation));
    }

    /**
     * 删除加油站
     */
    
    
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(gasStationService.deleteGasStationByIds(ids));
    }
}
