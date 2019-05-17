package com.basicwebshop.springstart.controller;

import com.basicwebshop.springstart.model.ShopItem;
import com.basicwebshop.springstart.model.ShopList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShowWebshop {

    List<ShopItem> list;
    ShopList shopList = new ShopList();

    public ShowWebshop() {
        list = shopList.buildShopList();
    }

    @RequestMapping(value = "/webshop")
    public String buildingList(Model model) {
        model.addAttribute("items", list);
        return "webshop";
    }

    @RequestMapping(value = "/only-available")
    public String onlyAvailableList(Model model) {
        model.addAttribute("items", list);
        return "webshop";
    }

    @RequestMapping(value = "/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("items", list);
        return "webshop";
    }

    @RequestMapping(value = "/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("items", list);
        return "webshop";
    }

    @RequestMapping(value = "/average-stock")
    public String averageStock(Model model) {
        model.addAttribute("average", shopList.averageStock());

        return "average";
    }

    @RequestMapping(value = "/most-expensive")
    public String mostExpensive(Model model) {
        model.addAttribute("mostExpensive", shopList.mostExpensive().getName());

        return "average";
    }

    @RequestMapping("/search")
    public String search(Model model, @RequestParam String search) {
        if (search != null) {
            model.addAttribute("items", shopList.getSearchedList(search));
        }
        else {
            search = "0";
        }
        return "webshop";
    }
}
