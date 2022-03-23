package com.example.thymeleaf.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @program: untitled
 * @description:
 * @author: 作者
 * @create: 2022-02-08 15:48
 */
@Data
public class UserVO {
        private String username;
        private Integer age;
        private Integer sex;
        private Boolean isVip;
        private Date createTime;
        private List<String> tags;
}
