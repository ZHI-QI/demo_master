package com.example.demo_master.entity;



import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: wangzhiqi
 * @Date: 2019/9/11 09:18
 * @Description:
 */
@Table(name = "t_user")
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 93135459178465075L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private int available;

    @Column
    private String salt;

    @Column
    private String role;

    @Column
    private String permissions;

    public User() {
    }

    public User(String username, String password, String salt, int available, String role, String permissions) {
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.available = available;
        this.role = role;
        this.permissions = permissions;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPermissions() {
        return permissions;
    }

    /**
     * 获取MD5盐  这里用username+salt实现
     * @return
     */
    public String getSalt() {
        return username+salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", available=" + available +
                ", role='" + role + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
