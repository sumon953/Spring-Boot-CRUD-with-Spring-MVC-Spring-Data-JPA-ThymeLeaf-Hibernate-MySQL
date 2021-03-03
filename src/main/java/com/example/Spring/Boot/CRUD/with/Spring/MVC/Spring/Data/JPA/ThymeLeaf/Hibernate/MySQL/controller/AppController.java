package com.example.Spring.Boot.CRUD.with.Spring.MVC.Spring.Data.JPA.ThymeLeaf.Hibernate.MySQL.controller;

import com.example.Spring.Boot.CRUD.with.Spring.MVC.Spring.Data.JPA.ThymeLeaf.Hibernate.MySQL.model.Product;
import com.example.Spring.Boot.CRUD.with.Spring.MVC.Spring.Data.JPA.ThymeLeaf.Hibernate.MySQL.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String ViewHomePage(Model model)
    {
        List<Product> listProduct = productService.listAll();
        model.addAttribute("listProduct",listProduct);
        return "index";
    }

}
