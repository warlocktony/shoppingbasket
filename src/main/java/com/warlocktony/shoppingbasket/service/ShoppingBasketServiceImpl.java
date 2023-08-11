package com.warlocktony.shoppingbasket.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingBasketServiceImpl implements ShoppingBasketService {

    private final ShoppingBasket shoppingBasket;

    public ShoppingBasketServiceImpl(ShoppingBasket shoppingBasket){
        this.shoppingBasket=shoppingBasket;
    }
    @Override
    public void add(List<Integer> goods){
        goods.forEach(product -> shoppingBasket.add(product));

    }
    @Override
    public List<Integer> get(){
        return shoppingBasket.getGoods();

    }
}
