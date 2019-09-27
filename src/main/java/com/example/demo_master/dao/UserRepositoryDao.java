package com.example.demo_master.dao;

import com.example.demo_master.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/26 15:12
 * @Description:
 */
public interface UserRepositoryDao extends CrudRepository<User, Long> {

}
