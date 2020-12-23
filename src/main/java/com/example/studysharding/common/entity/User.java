package com.example.studysharding.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * 
 * </p>
 *
 * @author chuiri
 * @since 2020-12-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private Integer age;
    /**
     * 加密 密码
     */
    @TableField(exist = false)
    private String pwd;
    /**
     * 加密 盐值
     */
    @TableField(exist = false)
    private String salt;
    /**
     * 用户所有角色值，用于shiro做角色权限的判断
     */
    @TableField(exist = false)
    private Set<String> roles = new HashSet<>();
    /**
     * 用户所有角色值，用于shiro做角色权限的判断
     */
    @TableField(exist = false)
    private Set<String> perms = new HashSet<>();
}
