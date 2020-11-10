package com.login.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class GreetingController {

//    @GetMapping("/hello")
//    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
//        log.info("U " + name);
//        model.addAttribute("name", name);
//        return "hello";
//    }

//    @GetMapping("/login")
//    public String greeting(@RequestParam(name = "username", value = "xxx") String username, @RequestParam(name = "password", value = "yyy") String password, Model model) {
//        log.info("U " + username + " P " + password);
//        model.addAttribute("username", username);
//        model.addAttribute("password", password);
//
//        return "login";
//    }
}
