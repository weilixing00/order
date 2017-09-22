package com.example.order.demo.repository;

import com.example.order.demo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRespositoryTest {


    @Autowired
    private ProductCategoryRespository respository;

    @Test
    public void findOneTest(){
        respository.findOne(3);
        System.out.println("2222");
    }

    @Test
    public void addOne(){
        ProductCategory category=new ProductCategory("青菜",7);
        respository.save(category);

    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list= Arrays.asList(2,3,4);
        List<ProductCategory> result = respository.findByCategoryTypeIn(list);
        Assert.assertNotNull(result);


    }

}