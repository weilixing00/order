package com.example.order.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String foodId;

    @JsonProperty("name")
    private String foodName;

    @JsonProperty("price")
    private BigDecimal foodPrice;

    @JsonProperty("description")
    private String foodDescription;

    @JsonProperty("icon")
    private String foodIcon;

}
