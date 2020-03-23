package com.cms.blogcms.service;

import com.cms.blogcms.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List getAllComments(){
        List comments = new ArrayList<>();
        commentRepository.findAll().forEach(comments::add);
        return comments;
    }
}
