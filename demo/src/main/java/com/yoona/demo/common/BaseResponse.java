package com.yoona.demo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description: 基本响应实体
 * @date 2022-05-09 14:21
 */
@Data
@ApiModel(value = "基本响应实体")
@NoArgsConstructor
public class BaseResponse {

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "响应信息")
    private String msg;


    public BaseResponse(ResponseEnum responseEnum) {
        this.code = responseEnum.getValue();
        this.msg = responseEnum.getDescription();
    }

    public BaseResponse(ResponseEnum responseEnum, String msg) {
        this.code = responseEnum.getValue();
        this.msg = msg;
    }

    public static BaseResponse isFailed(String exceptions) {
        return new BaseResponse(ResponseEnum.FAIL, exceptions);
    }

    public static BaseResponse isFailed(ResponseEnum responseEnum,String exceptions) {
        return new BaseResponse(responseEnum, exceptions);
    }

    public static BaseResponse isSuccessful() {
        return new BaseResponse(ResponseEnum.SUCCESS);
    }


}
