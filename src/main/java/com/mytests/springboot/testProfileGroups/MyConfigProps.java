package com.mytests.springboot.testProfileGroups;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 30.04.2021.</p>
 * <p>Project: spring-boot-profile-groups</p>
 * *
 */
@Component
@ConfigurationProperties("my.props")
public class MyConfigProps {

    String p1;
    String p2;

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }
}
