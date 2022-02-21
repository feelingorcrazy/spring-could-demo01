package com.vv.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wlj
 * @date 2022/02/19 10:54
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultEntity<T>{
    private Long code;
    private String message;
    private T t;

    public ResultEntity(Long code, String message) {
        this(code,message,null);
    }
}
