package com.domo.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.domo.springcloudconfigclient.service.DynamicConfigService;
import com.domo.springcloudconfigclient.service.StaticConfigService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class DemoApplicationRunner implements ApplicationRunner {

    private final StaticConfigService staticConfigService;
    private final DynamicConfigService dynamicConfigService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("[spring-cloud-config-server] static config info : " + staticConfigService.getConfig());
        System.out.println("[spring-cloud-config-server] dynamic config info : " + dynamicConfigService.getConfig());
    }

}
