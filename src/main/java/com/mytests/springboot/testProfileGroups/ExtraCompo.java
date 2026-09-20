package com.mytests.springboot.testProfileGroups;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("_extra")
@Profile("extra")
public class ExtraCompo {

    @Value("extra")
    String id;

    public String getId() {
        return id;
    }

}
