package com.material.mapper;

import com.material.entity.user.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/2/9
 * Time: 15:40
 */
@Mapper
public interface UserMapper {
    /**
     * 创建用户
     * @param user
     */
    void insertUser(User user);

    /**
     * 获取用户信息
     * @param user
     * @return
     */
    User selectUserInfo(User user);
    User selectUser(long userId);
}
