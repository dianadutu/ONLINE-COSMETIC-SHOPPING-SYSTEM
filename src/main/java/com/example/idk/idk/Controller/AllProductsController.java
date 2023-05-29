package com.example.idk.idk.Controller;

import com.example.idk.idk.Entity.Makeup;
import com.example.idk.idk.Service.MakeupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AllProductsController {
    private MakeupService makeupService;

    public AllProductsController(MakeupService makeupService) {
        this.makeupService = makeupService;
    }

    @RequestMapping("/products")
    public String allProducts(Model model){
        List<Makeup> produse;
        produse = makeupService.getAllMakeup();
        model.addAttribute("products", produse);
        return "products";
    }
}
