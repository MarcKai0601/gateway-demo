package com.example.gatewaydemo.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/test")
    public String getTestUrl() {
        return "test"; // 返回模板名称
    }
}

