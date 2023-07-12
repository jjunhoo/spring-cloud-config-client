package com.domo.springcloudconfigclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domo.springcloudconfigclient.service.DynamicConfigService;
import com.domo.springcloudconfigclient.service.StaticConfigService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class DemoController {

    private final StaticConfigService staticConfigService;
    private final DynamicConfigService dynamicConfigService;

    // 정적 config
    @GetMapping("/static")
    public Object getStaticConfig() {
        return staticConfigService.getConfig();
    }

    // 동적 config
    @GetMapping("/dynamic")
    public Object getDynamicConfig() {
        return dynamicConfigService.getConfig();
    }

}
