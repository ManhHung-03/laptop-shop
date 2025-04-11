package com.example.LaptopShop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "hello hưng đẹp trai vũ trụ";
    }

    @GetMapping("/user")
    public String userPage() {
        return "cho nhan vien";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "cho anh hung dep trai";
    }

}
