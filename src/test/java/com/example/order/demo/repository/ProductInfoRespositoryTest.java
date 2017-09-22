package com.example.order.demo.repository;

import com.example.order.demo.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoRespositoryTest {

    @Autowired
    private ProductInfoRespository respository;


    @Test
    public void addOne() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(2);
        productInfo.setProductName("productInfoName");
        BigDecimal bigDecimal = new BigDecimal(50);
        productInfo.setProductPrice(bigDecimal);
        productInfo.setProductId("2");
        productInfo.setProductStock(3);
        respository.save(productInfo);
    }

    @Test
    public void findOne() {
        respository.findOne("1");
    }

    @Test
    public void findAll(){
        List<ProductInfo> all = respository.findAll();
        log.info(all.size()+"");
    }

//    @Test
//    public void findByCategoryTypeIn(){
//        List<ProductInfo> byCategoryTypeIn = respository.findByCategoryTypeIn(Arrays.asList("1", "2"));
//
//        int size = byCategoryTypeIn.size();
//        log.info(size+"");
//
//    }

    @Test
    public void findByProductStatus(){
        List<ProductInfo> byProductStatus = respository.findByProductStatus(0);
        log.info(byProductStatus.size()+"");
    }

}