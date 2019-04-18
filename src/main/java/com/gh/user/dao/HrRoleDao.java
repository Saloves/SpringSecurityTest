package com.gh.user.dao;

import com.gh.user.entity.HrRoleDto;

public interface HrRoleDao {
    /**
     * 根据主键删除 hr_role
     * @param id 主键
     * @return  操作成功条数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入 hr_role
     * @param record hr_role
     * @return  操作成功条数
     */
    int insert(HrRoleDto record);

    /**
     * 插入 hr_role 字段值 --只插入数据不为null的字段数据
     * @param record hr_role
     * @return  操作成功条数
     */
    int insertSelective(HrRoleDto record);

    /**
     * 根据主键查询 hr_role
     * @param id 主键
     * @return  hr_role
     */
    HrRoleDto selectByPrimaryKey(Long id);

    /**
     * 根据主键修改 hr_role 字段值 --只修改数据不为null的字段数据
     * @param record hr_role
     * @return  操作成功条数
     */
    int updateByPrimaryKeySelective(HrRoleDto record);

    /**
     * 根据主键修改 hr_role 字段值
     * @param record hr_role
     * @return  操作成功条数
     */
    int updateByPrimaryKey(HrRoleDto record);
}