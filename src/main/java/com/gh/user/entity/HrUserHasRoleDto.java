package com.gh.user.entity;

/**
 *
 *  hr_user_has_role
 * @author gh
 */
public class HrUserHasRoleDto {
    /**
     * id
     */
    private Long id;

    /**
     * hr_user_id
     */
    private Long hr_user_id;

    /**
     * hr_role_id
     */
    private Long hr_role_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHr_user_id() {
        return hr_user_id;
    }

    public void setHr_user_id(Long hr_user_id) {
        this.hr_user_id = hr_user_id;
    }

    public Long getHr_role_id() {
        return hr_role_id;
    }

    public void setHr_role_id(Long hr_role_id) {
        this.hr_role_id = hr_role_id;
    }
}