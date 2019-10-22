package org.launchcode.safehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("safehouse")                    // request path: /safehouse
public class HouseController {

    @RequestMapping(value = "")
    public String index(Model model) {

        ArrayList<String> houses = new ArrayList<>();
        houses.add("saint louis");

        model.addAttribute("houses", houses);
        model.addAttribute("title", "Safe House");
        return "house/index";
    }
}
