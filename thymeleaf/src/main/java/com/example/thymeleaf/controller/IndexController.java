package com.example.thymeleaf.controller;

import com.example.thymeleaf.vo.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Date;

/**
 * @program: untitled
 * @description:
 * @author: 作者
 * @create: 2022-02-08 15:20
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("title","传递的Title");
        model.addAttribute("keywords","传递的keywords");
        model.addAttribute("description","传递的description");
        return "index";
    }
    @GetMapping( "/basicTrain" )
    public String basicTrain(Model model) {
        UserVO uservo = new UserVO();
        uservo.setUsername("lookroot");
        uservo.setAge(22);
        uservo.setIsVip(true);
        uservo.setCreateTime(new Date());
        uservo.setSex(1);
        uservo.setTags (Arrays.asList("PHP","Node","Java"));
        model.addAttribute("user",uservo);
        return "basic";
    }
}
