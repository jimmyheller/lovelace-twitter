package org.lovelace.twitter.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/basicinfo")
public class BasicInfoController {

    private static final String CONSUMER_KEY = "";
    private static final String CONSUMER_SECRET = "";
    private static final String ACCESS_TOKEN = "";
    private static final String ACCESS_TOKEN_SECRET = "";

    @GetMapping
    public String getBasicInfo() {
        return "";
    }
}
