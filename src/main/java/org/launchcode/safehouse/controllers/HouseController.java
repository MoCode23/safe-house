package org.launchcode.safehouse.controllers;

import org.launchcode.safehouse.models.House;
import org.launchcode.safehouse.models.HouseState;
import org.launchcode.safehouse.models.data.HouseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("safehouse")                    // request path: /safehouse
public class HouseController {

    @Autowired
    private HouseDao houseDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("houses", houseDao.findAll());
        model.addAttribute("title", "Safe House");
        return "house/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddHouseForm(Model model){
        model.addAttribute("title", "Add House");
        model.addAttribute(new House());
        model.addAttribute("houseStates", HouseState.values());
        return "house/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddHouseForm(@ModelAttribute @Valid House newHouse, Errors errors, Model model) {

        if (errors.hasErrors()){
            model.addAttribute("title", "Add House");
            return "house/add";
        }
        houseDao.save(newHouse);
        return "redirect:";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemoveHouseForm(Model model){
        model.addAttribute("houses", houseDao.findAll());
        model.addAttribute("title", "Remove House");
        return "house/remove";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveHouseForm(@RequestParam int[] ids){

        for (int id : ids) {
            houseDao.deleteById(id);
        }
        return "redirect:";
    }
}
