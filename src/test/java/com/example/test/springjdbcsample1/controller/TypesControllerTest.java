package com.example.test.springjdbcsample1.controller;

import com.example.test.springjdbcsample1.app.configurations.AppWebConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@WebMvcTest(TypesController.class)
public class TypesControllerTest {
    @Autowired
    WebApplicationContext wac;
    
    @Test
    public void testTypes() throws Exception {
        MockMvcBuilders.webAppContextSetup(wac).build().perform(get("/types").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().contentType("application/json"));
    }
    
    @EnableWebMvc
    @Configuration
    @ComponentScan(basePackageClasses = { AppWebConfig.class, TypesController.class })
    static class Config {
    }
}
