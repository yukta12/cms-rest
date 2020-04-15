package com.cms.blogcms.service;

import com.cms.blogcms.model.Post;
import com.cms.blogcms.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
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

    public Post getPostById(Long id){
        return postRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("not found"));
    }

    public void addPost(Post post){
         postRepository.save(post);
    }
}
