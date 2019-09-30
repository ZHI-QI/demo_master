package com.example.demo_master.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/11 10:34
 * @Description:
 */
@Controller

public class AuthorizationController {

    @GetMapping("/dog")
    public String dog(){
        Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("dog")){
            return "dog√";
        }
        else {
            return  "dog×";
        }
    }

    @GetMapping("/cat")
    public String cat(){
        Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("cat")){
            return "cat√";
        }
        else {
            return  "cat×";
        }
    }


    @GetMapping("/sing")
    @RequiresRoles("cat")
    public String sing(){
        return "sing";
    }
    @GetMapping("/jump")
    @RequiresPermissions("jump")
    public String jump(){
        return "jump";
    }
    @GetMapping("/rap")
    public String rap(){
        Subject subject = SecurityUtils.getSubject();
        if(subject.isPermitted("rap")){
            return "rap";
        }else{
            return "没权限你Rap个锤子啊!";
        }

    }
    @GetMapping("/basketball")
    public String basketball(){
        Subject subject = SecurityUtils.getSubject();
        if(subject.isPermitted("basketball")){
            return "basketball";
        }else{
            return "你会打个粑粑球!";
        }
    }

    @GetMapping("/sys/index")
    public String index(Model model){
        model.addAttribute("username", "wnaghziqi");
        return "index";
    }

    @GetMapping("/sys/album")
    public String album(){

        return "album";
    }

    @GetMapping("/sys/about")
    public String about(){

        return "about";
    }

    @GetMapping("/sys/leacots")
    public String leacots(){

        return "leacots";
    }

    @GetMapping("/sys/whisper")
    public String whisper(){

        return "whisper";
    }

    @GetMapping("/sys/quill")
    public String quill(){

        return "quill";
    }




}
