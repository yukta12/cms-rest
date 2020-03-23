package com.cms.blogcms.controller;

import com.cms.blogcms.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cms/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/all" , method = RequestMethod.GET)
    public List getAllComments(){
        return commentService.getAllComments();
    }
}
