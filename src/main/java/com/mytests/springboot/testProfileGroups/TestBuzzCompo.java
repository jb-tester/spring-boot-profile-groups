package com.mytests.springboot.testProfileGroups;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 30.04.2021.</p>
 * <p>Project: spring-boot-profile-groups</p>
 * *
 */
@Component("_testBuzzComponent")
@Profile("tst_buzz")
public class TestBuzzCompo {
}
