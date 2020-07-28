package com.microsoft.easyshop.controller;


import com.microsoft.easyshop.entity.User;
import com.microsoft.easyshop.mapper.UserMapper;
import com.microsoft.easyshop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2020-07-28
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IUserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/user")
    public User queryUserById(@RequestParam("id") Integer id){
        User user = userService.getById(id);
        return user;
    }
}

