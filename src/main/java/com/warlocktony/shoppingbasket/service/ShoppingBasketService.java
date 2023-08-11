package com.warlocktony.shoppingbasket.service;

import java.util.List;

public interface ShoppingBasketService {
    void add(List<Integer> goods);
    List<Integer> get();

}
