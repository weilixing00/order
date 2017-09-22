package com.example.order.demo.service;

import com.example.order.demo.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {
    public ProductInfo addOne(ProductInfo productInfo);

    //查询所有的
    List<ProductInfo> findUpAll();

    //分页
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo findOne(String productInfoId);

    List<ProductInfo> findByProductStatus(Integer productStatus);

    //添加库存

    //减库存


}
