package com.example.gas.controller;

import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.example.gas.domain.GasCoupon;
import com.example.gas.domain.base.AjaxResult;
import com.example.gas.domain.base.R;
import com.example.gas.domain.req.GasCouponListReq;
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

import com.example.gas.domain.GasCoupon;
import com.example.gas.service.IGasCouponService;


/**
 * 优惠券Controller
 *
 * @author ruoyi
 * @date 2025-02-25
 */
@RestController
@RequestMapping("/coupon")
public class GasCouponController extends BaseController
{
    @Autowired
    private IGasCouponService gasCouponService;

    /**
     * 查询优惠券列表
     */
    
    @GetMapping("/list")
    public R list(GasCouponListReq gasCouponListReq)
    {
        PageHelper.startPage(gasCouponListReq.getPageNum(), gasCouponListReq.getPageSize());
        GasCoupon gasCoupon = new GasCoupon();
        BeanUtils.copyProperties(gasCouponListReq, gasCoupon);

        List<GasCoupon> gasCoupons = gasCouponService.selectGasCouponList(gasCoupon);
        if (gasCoupons.size() > 0) {
            PageInfo<GasCoupon> pageInfo = new PageInfo<>(gasCoupons);
            return R.ok(pageInfo);
        }
        return R.ok(new PageInfo<GasCoupon>(Collections.emptyList()));
    }

    /**
     * 获取优惠券详细信息
     */
    
    @GetMapping(value = "/{code}")
    public AjaxResult getInfo(@PathVariable("code") String code)
    {
        return success(gasCouponService.selectGasCouponByCode(code));
    }

    /**
     * 新增优惠券
     */
    
    
    @PostMapping
    public AjaxResult add(@RequestBody GasCoupon gasCoupon)
    {
        return toAjax(gasCouponService.insertGasCoupon(gasCoupon));
    }

    /**
     * 修改优惠券
     */
    
    
    @PutMapping
    public AjaxResult edit(@RequestBody GasCoupon gasCoupon)
    {
        return toAjax(gasCouponService.updateGasCoupon(gasCoupon));
    }

    /**
     * 删除优惠券
     */
    
    
    @DeleteMapping("/{codes}")
    public AjaxResult remove(@PathVariable String[] codes)
    {
        return toAjax(gasCouponService.deleteGasCouponByCodes(codes));
    }
}
