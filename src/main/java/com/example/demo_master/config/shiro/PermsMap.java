package com.example.demo_master.config.shiro;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Description 权限Map 接受配置文件中的数据
 * @Author 张小黑的猫
 * @data 2019-05-27 11:19
 */
@Component
@ConfigurationProperties(prefix = "permission-config")
public class PermsMap {

    private List<Map<String,String>> perms;

    public List<Map<String, String>> getPerms() {
        return perms;
    }

    public void setPerms(List<Map<String, String>> perms) {
        this.perms = perms;
    }

}
