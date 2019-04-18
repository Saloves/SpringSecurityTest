package com.gh.user.entity;

/**
 *  hr_role
 * @author gh
 */
public class HrRoleDto {
    /**
     * id
     */
    private Long id;

    /**
     *   角色编码
     */
    private String code;

    /**
     *   角色名
     */
    private String name;

    /**
     * cur_status
     */
    private Integer cur_status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCur_status() {
        return cur_status;
    }

    public void setCur_status(Integer cur_status) {
        this.cur_status = cur_status;
    }
}