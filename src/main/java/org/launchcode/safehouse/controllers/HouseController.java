package org.launchcode.safehouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HouseController {
    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }
}
