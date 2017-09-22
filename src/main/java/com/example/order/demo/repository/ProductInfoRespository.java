package com.example.order.demo.repository;

import com.example.order.demo.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRespository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByCategoryTypeIn(List<String> tyList);

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
