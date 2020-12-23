package com.example.studysharding.common.service.impl;

import com.example.studysharding.common.service.IRoleService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: study-sharding
 * @description:
 * @author: chunri
 * @create: 2020-12-23 10:18
 **/
@Service
public class RoleServiceImpl implements IRoleService {
    /**
     * 模拟根据用户id查询返回用户的所有角色，实际查询语句参考：
     * SELECT r.rval FROM role r, user_role ur
     * WHERE r.rid = ur.role_id AND ur.user_id = #{userId}
     * @param uid
     * @return
     */
    @Override
    public Set<String> getRolesByUserId(Long uid){
        Set<String> roles = new HashSet<>();
        // roles.add("admin");
        roles.add("user");
        return roles;
    }
}
