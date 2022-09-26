package com.yoona.demo.business.controller;


import com.yoona.demo.business.service.TestService;
import com.yoona.demo.common.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yoonada
 * @since 2022-09-26 14:19:13
 */
@Api(tags = "测试")
@RestController
@RequestMapping("/business/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @ApiOperation("根据类型测试多数据查询")
    @GetMapping("/queryByType")
    public BaseResponse queryByType(@RequestParam("type") Integer type){
        return testService.queryByType(type);
    }

}
