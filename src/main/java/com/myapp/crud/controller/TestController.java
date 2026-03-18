package com.myapp.crud.controller;

import lombok.Getter;
import org.eclipse.tags.shaded.org.apache.xpath.objects.XString;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "Tested";
    }

}
