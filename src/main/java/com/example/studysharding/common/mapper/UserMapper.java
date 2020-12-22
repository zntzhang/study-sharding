package com.example.studysharding.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.studysharding.common.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chuiri
 * @since 2020-12-09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
