package com.example.demo_master.entity;

import javax.persistence.*;

/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/27 18:48
 * @Description:
 */
@Table(name = "t_title_name")
@Entity
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column
    private String title_name;

    @Column
    private String title_url;



    public Title() {
    }

    public Title(Long id, String title_name, String title_url) {
        this.id = id;
        this.title_name = title_name;
        this.title_url = title_url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle_name() {
        return title_name;
    }

    public void setTitle_name(String title_name) {
        this.title_name = title_name;
    }

    public String getTitle_url() {
        return title_url;
    }

    public void setTitle_url(String title_url) {
        this.title_url = title_url;
    }

}
