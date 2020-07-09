package com.iauto.provider.service.entiy;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class User implements Serializable {


    private static final long serialVersionUID = -744323133839421988L;

    private String name;
    private Integer age;
    private String idCard;
}
