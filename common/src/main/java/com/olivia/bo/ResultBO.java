package com.olivia.bo;

import com.olivia.constants.ResCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date 2019/5/21
 * @Author wildpea
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBO<T> {
    private ResCodeEnum resCodeEnum;
    private T data;

    public boolean isSuccess() {
        return resCodeEnum.isSuccess();
    }
}
