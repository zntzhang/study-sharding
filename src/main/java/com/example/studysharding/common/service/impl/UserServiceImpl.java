package com.example.studysharding.common.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.studysharding.common.entity.User;
import com.example.studysharding.common.mapper.UserMapper;
import com.example.studysharding.common.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chuiri
 * @since 2020-12-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(Wrappers.<User>lambdaQuery());
    }

    /**
     * 模拟查询返回用户信息
     * @param name
     * @return
     */
    @Override
    public User findUserByName(String name){
        User user = new User();
        user.setName(name);
        user.setPwd("J/ms7qTJtqmysekuY8/v1TAS+VKqXdH5sB7ulXZOWho=");//密码明文是123456
        user.setSalt("wxKYXuTPST5SG0jMQzVPsg==");//加密密码的盐值
        user.setId(new Random().nextLong());//随机分配一个id
        return user;
    }

}
