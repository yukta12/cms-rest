package com.cms.blogcms.service;

import com.cms.blogcms.model.Category;
import com.cms.blogcms.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List getAllCategories(){
        List categories = new ArrayList<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }
    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("not found"));
    }

    public void addCategory(Category category){ categoryRepository.save(category);}

    public void updateCategory(Category category){ categoryRepository.save(category);}

}
