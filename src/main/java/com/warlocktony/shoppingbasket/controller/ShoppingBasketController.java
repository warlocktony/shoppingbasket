package com.warlocktony.shoppingbasket.controller;

import com.warlocktony.shoppingbasket.service.ShoppingBasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")

public class ShoppingBasketController {

    private final ShoppingBasketService shoppingBasketService;

    public ShoppingBasketController(ShoppingBasketService shoppingBasketService){
        this.shoppingBasketService=shoppingBasketService;

    }
    @GetMapping("/add")
    public String add(@RequestParam List<Integer> goods){
        shoppingBasketService.add(goods);
        return "Goods is added to shopping basket";
    }
    @GetMapping("/get")
    public List<Integer> get(){
        return shoppingBasketService.get();
    }
}
