package com.example.idk.idk.Controller;

import com.example.idk.idk.Entity.Makeup;
import com.example.idk.idk.Service.MakeupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
