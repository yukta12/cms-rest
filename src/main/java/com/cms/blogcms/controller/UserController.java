package com.cms.blogcms.controller;


import com.cms.blogcms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cms")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/users/all",method = RequestMethod.GET)
    public List getAllUsers() {
        return userService.getAllUsers();
    }
}
