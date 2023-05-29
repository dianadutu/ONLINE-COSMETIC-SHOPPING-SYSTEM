package com.example.makeup.makeup.Controller;

import com.example.makeup.makeup.Entity.Makeup;
import com.example.makeup.makeup.Service.MakeupService;
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
