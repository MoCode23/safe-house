package org.launchcode.safehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("safehouse")                    // request path: /safehouse
public class HouseController {

    static ArrayList<String> houses = new ArrayList<>();

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("houses", houses);
        model.addAttribute("title", "Safe House");
        return "house/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddHouseForm(Model model){
        model.addAttribute("title", "Add House");
        return "house/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddHouseForm(@RequestParam String houseZip){
        houses.add(houseZip);
        return "redirect:";
    }
}
