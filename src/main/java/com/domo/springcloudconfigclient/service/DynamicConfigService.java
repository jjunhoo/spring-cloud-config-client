package com.domo.springcloudconfigclient.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope // spring-cloud-config-server 변경 시, refresh
public class DynamicConfigService {

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
