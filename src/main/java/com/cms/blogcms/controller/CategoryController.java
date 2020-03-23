package com.cms.blogcms.controller;


import com.cms.blogcms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cms/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/all" , method = RequestMethod.GET)
    public List getAllCategories(){
        return categoryService.getAllCategories();
    }
}
