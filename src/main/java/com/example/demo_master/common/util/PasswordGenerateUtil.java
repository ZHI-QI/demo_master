package com.example.demo_master.common.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/17 09:39
 * @Description:
 */
public class PasswordGenerateUtil {

    public static String getPassword(String username,String password,String salt,int hashTimes){
        Md5Hash md5Hash = new Md5Hash(password,username+salt,hashTimes);
        return md5Hash.toString();
    }
}
