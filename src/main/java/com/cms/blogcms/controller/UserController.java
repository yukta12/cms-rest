package com.cms.blogcms.controller;


import com.cms.blogcms.model.User;
import com.cms.blogcms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cms/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public User getUserById(@PathVariable Long id){ return  userService.getUserById(id);}

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public void addUser(@RequestBody User user){ userService.addUser(user);}

    @RequestMapping(value = "/{id}/edit" , method = RequestMethod.PATCH)
    public void updateUser(@RequestBody User user, @PathVariable Long id){
        user.setId(id);
        userService.updateUser(user);
    }


}
