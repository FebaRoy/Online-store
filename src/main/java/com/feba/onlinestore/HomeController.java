package com.feba.onlinestore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index() {
        System.out.println("Application Name:" + appName);
        return ViewOutput();
    }

    public String ViewOutput() {
        return "index.html";
    }
}
