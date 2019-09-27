package com.example.demo_master.service;

import com.example.demo_master.entity.User;
import java.util.List;

/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/26 15:16
 * @Description:
 */
public interface UserService {

    User save(User book);

    void delete(Long id);

    List<User> getAll();

}
