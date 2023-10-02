package org.launchcode.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //Add a single GET handler method that returns the name templated index, which will be the name of the template we create in the next step.
    @GetMapping
    public String index() {
        return "index";
    }

}
