package com.basicwebshop.springstart.model;

import java.util.*;
import java.util.stream.Collectors;

public class ShopList {

    public List<ShopItem> buildShopList() {

        List<ShopItem> shopList = new ArrayList<>();

        shopList.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
        shopList.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
        shopList.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
        shopList.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
        shopList.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));

        return shopList;
    }

    public List<ShopItem> onlyAvailableList() {

        List<ShopItem> shopList = buildShopList()
                .stream()
                .filter(item -> item.getQuantityOfStock() > 0)
                .collect(Collectors.toList());

        return shopList;
    }

    public List<ShopItem> cheapestFirst() {

        List<ShopItem> shopList = buildShopList()
                .stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());

        return shopList;
    }

    public List<ShopItem> containsNike() {

        List<ShopItem> shopList = buildShopList()
                .stream()
                .filter(i -> i.getDescription().contains("Nike") || i.getName().contains("Name"))
                .collect(Collectors.toList());

        return shopList;
    }

    public double averageStock() {

        double average = buildShopList()
                .stream()
                .mapToDouble(ShopItem::getQuantityOfStock).average().getAsDouble();

        return average;
    }

    public ShopItem mostExpensive() {

        ShopItem mostExpensive = buildShopList()
                .stream()
                .max(Comparator.comparing(ShopItem::getPrice))
                .orElseThrow(NoSuchElementException::new);

        return mostExpensive;
    }

    public List<ShopItem> getSearchedList(String search) {

        List<ShopItem> shopList = buildShopList()
                .stream()
                .filter(i -> i.getName().contains(search) || i.getDescription().contains(search))
                .collect(Collectors.toList());

        return shopList;
    }
}

