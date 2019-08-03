package com.itheima.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@ToString
@Data
public class User implements Serializable {
    private Integer uid;
    private String username;
    private String address;
}