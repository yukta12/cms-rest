package com.cms.blogcms.service;

import com.cms.blogcms.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List getAllPosts(){
        List posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return  posts;
    }
}
