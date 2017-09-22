package com.example.order.demo.service.impl;

import com.example.order.demo.constants.Constants;
import com.example.order.demo.dataobject.ProductInfo;
import com.example.order.demo.repository.ProductInfoRespository;
import com.example.order.demo.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoRespository respository;

    @Override
    public ProductInfo addOne(ProductInfo productInfo) {
//        ProductInfo productInfo1=new ProductInfo();
//        productInfo.setProductStock(1000);
//        productInfo.setProductPrice(new BigDecimal(10));

        return respository.save(productInfo);
    }

    //查询所有在架的商品
    @Override
    public List<ProductInfo> findUpAll() {
        return respository.findByProductStatus(Constants.ProductStatus_UP);
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return respository.findAll(pageable);
    }

    @Override
    public ProductInfo findOne(String productInfoId) {
        return respository.findOne(productInfoId);
    }

    @Override
    public List<ProductInfo> findByProductStatus(Integer productStatus) {
        return respository.findByProductStatus(productStatus);
    }
}
