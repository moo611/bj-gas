package com.example.gas.mapper;

import com.example.gas.domain.GasUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户Mapper接口
 *
 * 
 * @date 2024-10-19
 */
@Mapper
public interface GasUserMapper
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
     * @param sptUser 用户
     * @return 用户集合
     */
    public List<GasUser> selectGasUserList(GasUser sptUser);

    /**
     * 新增用户
     *
     * @param sptUser 用户
     * @return 结果
     */
    public int insertGasUser(GasUser sptUser);

    /**
     * 修改用户
     *
     * @param sptUser 用户
     * @return 结果
     */
    public int updateGasUser(GasUser sptUser);

    /**
     * 删除用户
     *
     * @param id 用户主键
     * @return 结果
     */
    public int deleteGasUserById(Long id);

    /**
     * 批量删除用户
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGasUserByIds(Long[] ids);

    GasUser selectGasUserByUsername(String username);

}
