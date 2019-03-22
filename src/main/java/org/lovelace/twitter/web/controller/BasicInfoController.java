package org.lovelace.twitter.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/basicinfo")
public class BasicInfoController {


    @GetMapping
    public String getBasicInfo() {
        return "";
    }
}
