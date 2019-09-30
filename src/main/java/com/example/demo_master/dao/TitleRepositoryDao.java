package com.example.demo_master.dao;

import com.example.demo_master.entity.Title;
import org.springframework.data.repository.CrudRepository;

/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/27 19:00
 * @Description:
 */
public interface TitleRepositoryDao extends CrudRepository<Title, Long> {

}
