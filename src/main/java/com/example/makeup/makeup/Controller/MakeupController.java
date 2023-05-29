package com.example.makeup.makeup.Controller;

import com.example.makeup.makeup.Service.MakeupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MakeupController {
    private MakeupService makeupService;


    @Autowired
    public MakeupController(MakeupService makeupService) {
        this.makeupService = makeupService;
    }

    @RequestMapping("/")
    public String hello(){

        return "makeup"; // acelasi nume la html

    }
}
