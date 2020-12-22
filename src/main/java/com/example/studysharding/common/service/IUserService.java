package com.example.studysharding.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.studysharding.common.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chuiri
 * @since 2020-12-09
 */
public interface IUserService extends IService<User> {

    List<User> getUserList();
}
