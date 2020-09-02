package com.cmr.swaggerdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("test")
@RestController
public class TestController {

    @ApiOperation(value = "测试", notes = "测试swagger")
    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
