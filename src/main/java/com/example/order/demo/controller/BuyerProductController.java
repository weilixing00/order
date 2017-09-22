package com.example.order.demo.controller;

import com.example.order.demo.dataobject.ProductCategory;
import com.example.order.demo.dataobject.ProductInfo;
import com.example.order.demo.repository.ProductInfoRespository;
import com.example.order.demo.service.CategoryService;
import com.example.order.demo.service.ProductInfoService;
import com.example.order.demo.vo.ProductInfoVO;
import com.example.order.demo.vo.ProductVO;
import com.example.order.demo.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {


    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductInfoService productInfoService;




    @GetMapping("/list")
    public ResultVO list() {

        //1.查询所有商家商品
        List<ProductInfo> productInfoServiceUpAll = productInfoService.findUpAll();

        //2.查询类目（一次性查询）
        List

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        ProductVO productVO = new ProductVO();

        List<ProductInfoVO> productInfoVOS=new ArrayList<>();
        ProductInfoVO productInfoVO=new ProductInfoVO();

        productInfoVOS.add(productInfoVO);
        productVO.setProductInfoVOList(productInfoVOS);
        resultVO.setData(productVO);
        return resultVO;
    }
}
