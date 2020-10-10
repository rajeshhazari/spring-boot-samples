package com.example.test.springjdbcsample1.controller;

import com.google.common.collect.Lists;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypesController {
    @RequestMapping(path = "/types", produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<String> message() {
        return Lists.newArrayList("One");
    }
}
