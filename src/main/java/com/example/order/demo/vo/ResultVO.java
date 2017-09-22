package com.example.order.demo.vo;

import lombok.Data;

@Data //http请求返回的最外层对象
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
