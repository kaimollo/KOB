package com.kob.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk")
public class botInfoController {
    @RequestMapping("/getBotInfo")
    Map<String,String> getBotInfo(){
        Map<String,String> amp =new HashMap<>();
        amp.put("age","18");
        amp.put("name", "lihua");
        return amp;
     }
}
