package com.basicwebshop.springstart.controller;

import com.basicwebshop.springstart.model.ShopItem;
import com.basicwebshop.springstart.model.ShopList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShowWebshop {

    List<ShopItem> list;

    /*public ShowWebshop() {
        ShopList shopList = new ShopList();
        list = shopList.onlyAvailableList();*/

    public ShowWebshop() {
        ShopList shopList = new ShopList();
        list = shopList.onlyAvailableList();
    }

    @RequestMapping(value = "/webshop")
    public String webshop() {
        return "webshop";
    }

    @RequestMapping(value = "/only-available")
    public String onlyAvailableItems(Model model) {
        model.addAttribute("items", list);
        return "webshop";
    }
}
