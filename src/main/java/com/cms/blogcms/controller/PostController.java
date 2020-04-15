package com.cms.blogcms.controller;


import com.cms.blogcms.model.Post;
import com.cms.blogcms.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cms/post")
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List getAllPosts(){
       return  postService.getAllPosts();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Post getPostById(@PathVariable Long id){ return postService.getPostById(id);}

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public void addPost(@RequestBody Post post ){  postService.addPost(post);}
}
