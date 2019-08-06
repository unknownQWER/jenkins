package com.wanggang.controller;

import com.netflix.discovery.converters.Auto;
import com.wanggang.service.FactorialProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam/math/factorial_provider")
public class FactorialProviderController {

    @Autowired
    private FactorialProviderService providerService;

    @GetMapping("/math")
    public Integer math(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        return providerService.math(a,b);

    }
}
