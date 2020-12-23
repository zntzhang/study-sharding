package com.example.studysharding.common.controller;


import com.example.studysharding.common.entity.User;
import com.example.studysharding.common.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chuiri
 * @since 2020-12-09
 */
@RestController
@RequestMapping("/common/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/select")
    @RequiresPermissions("user:read")
    public List<User> select() {
        return userService.getUserList();
    }

    @GetMapping("/insert")
    // @RequiresPermissions("user:insert")
    public Boolean insert(User user) {
        return userService.save(user);
    }

}
