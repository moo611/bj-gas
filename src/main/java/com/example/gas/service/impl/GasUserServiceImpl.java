package com.example.gas.service.impl;

import com.example.gas.domain.GasUser;
import com.example.gas.mapper.GasUserMapper;
import com.example.gas.service.IGasUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 用户Service业务层处理
 *
 * 
 * @date 2024-10-19
 */
@Service
public class GasUserServiceImpl implements IGasUserService
{
    @Autowired
    private GasUserMapper sptUserMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;  // 注入 PasswordEncode
    /**
     * 查询用户
     *
     * @param id 用户主键
     * @return 用户
     */
    @Override
    public GasUser selectGasUserById(Long id)
    {
        return sptUserMapper.selectGasUserById(id);
    }

    /**
     * 查询用户列表
     *
     * @param sptUser 用户
     * @return 用户
     */
    @Override
    public List<GasUser> selectGasUserList(GasUser sptUser)
    {
        return sptUserMapper.selectGasUserList(sptUser);
    }

    /**
     * 新增用户
     *
     * @param sptUser 用户
     * @return 结果
     */
    @Override
    public int insertGasUser(GasUser sptUser)
    {
        GasUser old = sptUserMapper.selectGasUserByUsername(sptUser.getUsername());
        if (old != null){
            return -32001;
        }
        String encodedPassword = passwordEncoder.encode(sptUser.getPassword());
        sptUser.setPassword(encodedPassword);
        sptUser.setCreateTime(new Date());
        
        return sptUserMapper.insertGasUser(sptUser);
    }

    /**
     * 修改用户
     *
     * @param sptUser 用户
     * @return 结果
     */
    @Override
    public int updateGasUser(GasUser sptUser)
    {

        GasUser old = sptUserMapper.selectGasUserByUsername(sptUser.getUsername());
        if (!old.getId().equals(sptUser.getId())){
            return -32001;
        }

        sptUser.setUpdateTime(new Date());
        return sptUserMapper.updateGasUser(sptUser);
    }

    /**
     * 批量删除用户
     *
     * @param ids 需要删除的用户主键
     * @return 结果
     */
    @Override
    public int deleteGasUserByIds(Long[] ids)
    {
        return sptUserMapper.deleteGasUserByIds(ids);
    }

    /**
     * 删除用户信息
     *
     * @param id 用户主键
     * @return 结果
     */
    @Override
    public int deleteGasUserById(Long id)
    {
        return sptUserMapper.deleteGasUserById(id);
    }

    @Override
    public GasUser selectRtUserByUsername(String username) {
        return sptUserMapper.selectGasUserByUsername(username);
    }
}
