package com.example.order.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;

@Entity
@DynamicUpdate
@Data
public class ProductInfo {
    @Id
    private String productId;

    //商品名称
    private String productName;
//单价
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //描述
    private String productDescription;

    //小图
    private String productIcon;

    //状态 0正常   1下架
    private Integer productStatus;

    //类目编号
    private Integer categoryType;


}
