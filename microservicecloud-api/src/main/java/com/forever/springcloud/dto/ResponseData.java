package com.forever.springcloud.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author Forever丶诺
 * @since 2018-07-09
 */
@Data
@Accessors(chain = true)
public class ResponseData<T> {
    private List<T> rows;
    private Object data;
    private Long count;
    private Integer code = 200;
    private String msg = "";

    public ResponseData set300Msg( String msg) {
        return this.setCode(300).setMsg(msg);
    }
}