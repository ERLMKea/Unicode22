package com.example.unicode22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeRestController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }

    @GetMapping("/ch/{ch}")
    public String unicodeValueCharacter(@PathVariable char ch) {
        int i = ch;
        //int i2 = ch.hashCode();
        return "char="+ ch + " unicode=" + i;
    }

    @GetMapping("/unicodenum/{i}/{num}")
    public String unicodeValueString2(@PathVariable int i, @PathVariable int num) {
        char c = (char)i;
        String s = "code=" + i + " c=" + c;
        for (int n = 0; n < num; n++) {
            s = s + "<br>" + "code=" + (n+i) + " char=" + (char)(n+i);
        }
        return s;
    }

}

