package com.imlc.springcloud.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: L.C
 * @Date: 2019-07-12 14:16
 */
@RestController
public class ConfigClientApp {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;


    public String getConfig() {
        String str = "applicationName: " + applicationName + "\n eurekaServers: " + eurekaServers + "\n port: " + port;
        logger.info("*****str: " + str);
        return str;
    }

}