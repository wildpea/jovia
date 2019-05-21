package com.olivia.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@Getter
@ToString
@AllArgsConstructor
public enum ResCodeEnum {

    SUCCESS(0, "SUCCESS"),
    ERR_INPUT_PARAM(-1, "err input param");


    private Integer code;
    private String msg;

    public boolean isSuccess() {
        return this == SUCCESS;
    }
}
