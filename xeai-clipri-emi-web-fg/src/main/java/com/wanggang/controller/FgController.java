package com.wanggang.controller;

import com.wanggang.client.ProviderClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("测试swagger的controller")
public class FgController {

    @Autowired
    private ProviderClient providerClient;

    @ApiOperation("测试swagger的方法")
    @GetMapping("/math")
    public String index(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        Integer math = providerClient.math(a, b);
        return math.toString();
    }
}
