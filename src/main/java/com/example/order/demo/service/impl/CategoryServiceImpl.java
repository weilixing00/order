package com.example.order.demo.service.impl;

import com.example.order.demo.dataobject.ProductCategory;
import com.example.order.demo.repository.ProductCategoryRespository;
import com.example.order.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRespository respository;

    @Override
    public ProductCategory findOne(Integer categoryId) {


        return  respository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return respository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {

        return respository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory addOne(ProductCategory productCategory) {

        return respository.save(productCategory);
    }
}
