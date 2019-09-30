package com.example.demo_master.controller;

import com.example.demo_master.common.vo.Result;
import com.example.demo_master.dao.TitleRepositoryDao;
import com.example.demo_master.entity.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/27 18:47
 * @Description:
 */
@RestController
@RequestMapping("/collect")
public class TestController {

    @Autowired
    private TitleRepositoryDao titleRepositoryDao;

    @RequestMapping(value = "/collect", method = RequestMethod.POST)
    public Result core() {
        Result result = new Result();

        Iterable<Title> all = titleRepositoryDao.findAll();
        result.setCode(0);
        result.setMessage("调用成功");
        result.setData(all);
        return result;
    }



}
