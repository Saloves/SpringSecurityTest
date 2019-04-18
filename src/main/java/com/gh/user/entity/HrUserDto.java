package com.gh.user.entity;

import java.util.Date;

/**
 *
 *  hr_user
 * @author gh
 */
public class HrUserDto {
    /**
     * id
     */
    private Long id;

    /**
     *   账号
     */
    private String account;

    /**
     *    姓名
     */
    private String name;

    /**
     *   其它信息
     */
    private String info;

    /**
     *   创建时间
     */
    private Date creattime;

    /**
     *   状态
     */
    private Integer cur_status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Integer getCur_status() {
        return cur_status;
    }

    public void setCur_status(Integer cur_status) {
        this.cur_status = cur_status;
    }
}