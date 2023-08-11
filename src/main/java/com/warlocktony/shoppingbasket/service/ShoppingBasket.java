package com.warlocktony.shoppingbasket.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope

public class ShoppingBasket {

    private final List<Integer> goods;

    public ShoppingBasket(){
        goods = new ArrayList<>();
    }

    public void add(Integer product){
        goods.add(product);
    }

    public List<Integer> getGoods(){
        return goods;
    }
}
