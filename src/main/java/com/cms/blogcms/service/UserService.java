package com.cms.blogcms.service;


import com.cms.blogcms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List getAllUsers(){
        List users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
}
