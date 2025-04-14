package com.example.gas.service;

import com.example.gas.domain.GasUser;

import java.util.List;

/**
 * 用户Service接口
 *
 * 
 * @date 2024-10-19
 */
public interface IGasUserService
{
    /**
     * 查询用户
     *
     * @param id 用户主键
     * @return 用户
     */
    public GasUser selectGasUserById(Long id);

    /**
     * 查询用户列表
     *
     * @param gasUser 用户
     * @return 用户集合
     */
    public List<GasUser> selectGasUserList(GasUser gasUser);

    /**
     * 新增用户
     *
     * @param gasUser 用户
     * @return 结果
     */
    public int insertGasUser(GasUser gasUser);

    /**
     * 修改用户
     *
     * @param gasUser 用户
     * @return 结果
     */
    public int updateGasUser(GasUser gasUser);

    /**
     * 批量删除用户
     *
     * @param ids 需要删除的用户主键集合
     * @return 结果
     */
    public int deleteGasUserByIds(Long[] ids);

    /**
     * 删除用户信息
     *
     * @param id 用户主键
     * @return 结果
     */
    public int deleteGasUserById(Long id);

    GasUser selectRtUserByUsername(String username);
}
