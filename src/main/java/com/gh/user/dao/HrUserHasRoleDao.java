package com.gh.user.dao;

import com.gh.user.entity.HrUserHasRoleDto;

public interface HrUserHasRoleDao {
    /**
     * 根据主键删除 hr_user_has_role
     * @param id 主键
     * @return  操作成功条数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入 hr_user_has_role
     * @param record hr_user_has_role
     * @return  操作成功条数
     */
    int insert(HrUserHasRoleDto record);

    /**
     * 插入 hr_user_has_role 字段值 --只插入数据不为null的字段数据
     * @param record hr_user_has_role
     * @return  操作成功条数
     */
    int insertSelective(HrUserHasRoleDto record);

    /**
     * 根据主键查询 hr_user_has_role
     * @param id 主键
     * @return  hr_user_has_role
     */
    HrUserHasRoleDto selectByPrimaryKey(Long id);

    /**
     * 根据主键修改 hr_user_has_role 字段值 --只修改数据不为null的字段数据
     * @param record hr_user_has_role
     * @return  操作成功条数
     */
    int updateByPrimaryKeySelective(HrUserHasRoleDto record);

    /**
     * 根据主键修改 hr_user_has_role 字段值
     * @param record hr_user_has_role
     * @return  操作成功条数
     */
    int updateByPrimaryKey(HrUserHasRoleDto record);
}