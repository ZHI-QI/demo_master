package com.example.demo_master.service.impl;

import com.example.demo_master.dao.UserRepositoryDao;
import com.example.demo_master.entity.User;
import com.example.demo_master.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/26 15:18
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryDao userRepositoryDao;

    @Override
    public User save(User book) {
        return userRepositoryDao.save(book);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
