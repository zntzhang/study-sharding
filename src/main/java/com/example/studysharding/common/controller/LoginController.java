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
@RequestMapping("/common/login")
public class LoginController {

    /**
     * 登陆
     *
     * @param username 用户名
     * @param password 密码
     */
    @GetMapping(value = "/login")
    public String login(String username, String password) {
        // 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 执行认证登陆
        subject.login(token);
        return "登录成功";
    }

    @GetMapping(value = "/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return "退出成功";
    }

    @GetMapping(value = "/notLogin")
    public String notLogin() {
        return "没有登录";
    }

    @GetMapping(value = "/notRole")
    public String notRole() {
        return "没有权限";
    }
}
