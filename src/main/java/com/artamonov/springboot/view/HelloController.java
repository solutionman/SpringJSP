package com.artamonov.springboot.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping({"/","/hello","/springjsp"})
    public String hello(Model model, @RequestParam(value = "name",
            required = false, defaultValue = "from default value!") String name){

        model.addAttribute("name", name);

        return "hello";
    }
}
