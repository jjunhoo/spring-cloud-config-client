package com.domo.springcloudconfigclient.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StaticConfigService {

    // spring-cloud-config-server 의 profile 값
    @Value("${junho.profile}")
    private String profile;

    // spring-cloud-config-server 의 text 값
    @Value("${junho.text}")
    private String text;

    public Map<String, String> getConfig() {
        Map<String, String> config = new HashMap<>();
        config.put("profile", profile);
        config.put("text", text);

        return config;
    }

}
