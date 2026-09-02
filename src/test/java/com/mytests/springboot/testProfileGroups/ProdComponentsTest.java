package com.mytests.springboot.testProfileGroups;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles(profiles = {"dev"})
class ProdComponentsTest {
@Autowired
ApplicationContext ctx;
    @Test
    void checkBeansAmount() {
        List<String> beanNames = new ArrayList<>();
        for (String el : ctx.getBeanDefinitionNames()) {
            if (el.startsWith("_")) {
                System.out.println(el);
                beanNames.add(el);
            }

        }
        assertEquals(3, beanNames.size());
    }
}