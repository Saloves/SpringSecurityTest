package com.gh.user.dao;

import com.gh.user.entity.HrUserDto;

public interface HrUserDao {
    /**
     * 根据主键删除 hr_user
     * @param id 主键
     * @return  操作成功条数
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入 hr_user
     * @param record hr_user
     * @return  操作成功条数
     */
    int insert(HrUserDto record);

    /**
     * 插入 hr_user 字段值 --只插入数据不为null的字段数据
     * @param record hr_user
     * @return  操作成功条数
     */
    int insertSelective(HrUserDto record);

    /**
     * 根据主键查询 hr_user
     * @param id 主键
     * @return  hr_user
     */
    HrUserDto selectByPrimaryKey(Long id);

    /**
     * 根据主键修改 hr_user 字段值 --只修改数据不为null的字段数据
     * @param record hr_user
     * @return  操作成功条数
     */
    int updateByPrimaryKeySelective(HrUserDto record);

    /**
     * 根据主键修改 hr_user 字段值
     * @param record hr_user
     * @return  操作成功条数
     */
    int updateByPrimaryKey(HrUserDto record);
}