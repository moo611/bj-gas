package com.example.gas.controller;

import com.example.gas.config.auth.JwtUtil;
import com.example.gas.config.auth.MyUserDetailsService;
import com.example.gas.config.auth.UserUtil;
import com.example.gas.domain.GasUser;
import com.example.gas.domain.base.AjaxResult;
import com.example.gas.domain.base.R;
import com.example.gas.domain.req.LoginReq;
import com.example.gas.domain.req.GasUserListReq;
import com.example.gas.service.IGasUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;


/**
 * 用户Controller
 *
 * 
 * @date 2024-10-19
 */
@RestController
@RequestMapping("/user")
public class GasUserController extends BaseController {
    @Autowired
    private IGasUserService gasUserService;

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MyUserDetailsService myUserDetailsService;
    @Autowired
    private JwtUtil jwtUtil;
    @PostMapping("/login")
    @ApiOperation("登录")
    public AjaxResult login(@RequestBody LoginReq loginReq) {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginReq.getUsername(), loginReq.getPassword())
            );
        }catch (Exception e){
            return AjaxResult.error("用户名或密码错误");
        }

        final UserDetails userDetails = myUserDetailsService.loadUserByUsername(loginReq.getUsername());
        return AjaxResult.success("ok",jwtUtil.generateToken(userDetails.getUsername()));

    }


    /**
     * 查询用户列表
     */

    @GetMapping("/list")
    public R list(GasUserListReq gasUserListReq) {
        PageHelper.startPage(gasUserListReq.getPageNum(), gasUserListReq.getPageSize());
        GasUser gasUser = new GasUser();
        BeanUtils.copyProperties(gasUserListReq, gasUser);

        List<GasUser> gasUsers = gasUserService.selectGasUserList(gasUser);
        if (gasUsers.size() > 0) {
            PageInfo<GasUser> pageInfo = new PageInfo<>(gasUsers);
            return R.ok(pageInfo);
        }
        return R.ok(new PageInfo<GasUser>(Collections.emptyList()));
    }


    /**
     * 获取用户详细信息
     */

    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(gasUserService.selectGasUserById(id));
    }

    /**
     * 获取用户详细信息
     */

    @GetMapping(value = "/info")
    @ApiOperation("获取用户详细信息")
    public AjaxResult getInfo()
    {
        String username = UserUtil.getCurrentUsername();
        return success(gasUserService.selectRtUserByUsername(username));
    }

    /**
     * 新增用户
     */


    @PostMapping
    public AjaxResult add(@RequestBody GasUser gasUser) {

        int res = gasUserService.insertGasUser(gasUser);
        if (res == -32001){
            return AjaxResult.error("用户名已存在");
        }
        return toAjax(res);


    }

    /**
     * 修改用户
     */


    @PutMapping
    public AjaxResult edit(@RequestBody GasUser gasUser) {
        int res = gasUserService.updateGasUser(gasUser);
        if (res == -32001){
            return AjaxResult.error("用户名已存在");
        }
        return toAjax(res);
    }

    /**
     * 删除用户
     */


    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(gasUserService.deleteGasUserByIds(ids));
    }
}
