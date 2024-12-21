package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/fragment-page")
    public String fragmentPage(Model page){

        return "fragment"; //fragment.html
    }
}
