package com.course.bean;

import lombok.Data;

//需装插件并且引入pom依赖
@Data
public class User {
    private String userName;
    private String password;
    private String name;
    private String age;
    private String sex;
}
