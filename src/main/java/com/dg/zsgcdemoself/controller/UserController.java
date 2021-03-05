package com.dg.zsgcdemoself.controller;

import com.dg.zsgcdemoself.entity.UserEntity;
import com.dg.zsgcdemoself.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author snowball
 * @create 2021-03-01 21:44
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getall")
    public List<UserEntity> getAll(Map map)
    {
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }

    @ResponseBody
    @RequestMapping("/save")
    public String save(@RequestBody UserEntity userEntity){
        userService.save(userEntity);
        return "success";
    }



}
