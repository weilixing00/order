package com.example.order.demo.service.impl;

import com.example.order.demo.constants.Constants;
import com.example.order.demo.dataobject.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl service;
    @Test
    public void addOne() throws Exception {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductPrice(new BigDecimal(100));
        productInfo.setProductStock(99);
        productInfo.setProductId("1");
        productInfo.setProductName("酸菜鱼");
        productInfo.setProductDescription("酸菜鱼很好吃");
        productInfo.setProductIcon("http://xxxx.jsp");
        productInfo.setProductStatus(Constants.ProductStatus_UP);
        productInfo.setCategoryType(1);
        service.addOne(productInfo);
    }

    @Test
    public void findUpAll() throws Exception {

        service.findUpAll();
        log.info(service.findUpAll().size()+"");
    }

    @Test
    public void findUpAll1() throws Exception {
        PageRequest pageRequest=new PageRequest(1,3);

        Page<ProductInfo> all = service.findAll(pageRequest);
        log.info(all.getTotalElements()+"");

    }

    @Test
    public void findOne() throws Exception {
        String string = service.findOne("1").toString();
        log.info(string);
    }

    @Test
    public void findByProductStatus() throws Exception {

    }

}