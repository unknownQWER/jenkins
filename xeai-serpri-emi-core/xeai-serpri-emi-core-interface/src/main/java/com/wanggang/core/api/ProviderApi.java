package com.wanggang.core.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ProviderApi {
    @GetMapping("/exam/math/factorial_provider/math")
    Integer math(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

}
