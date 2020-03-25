package com.cms.blogcms.controller;


import com.cms.blogcms.model.Category;
import com.cms.blogcms.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cms/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/all" , method = RequestMethod.GET)
    public List getAllCategories(){
        return categoryService.getAllCategories();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable Long id){ return  categoryService.getCategoryById(id);}

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public void addCategory(@RequestBody Category category){ categoryService.addCategory(category);}

    @RequestMapping(value = "/{id}/edit" , method = RequestMethod.PATCH)
    public void updateCategory(@RequestBody Category category, @PathVariable Long id){ categoryService.updateCategory(category);}

}
