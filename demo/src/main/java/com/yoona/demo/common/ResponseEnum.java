package com.yoona.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description: 响应枚举
 * @date 2022-05-09 14:40
 */
@Getter
@AllArgsConstructor
public enum ResponseEnum implements IBaseEnum<Integer> {

    /**
     * 枚举所有响应
     */
    SUCCESS(200, "成功"),

    FAIL(100, "系统异常");

    private final Integer value;

    private final String description;


}
