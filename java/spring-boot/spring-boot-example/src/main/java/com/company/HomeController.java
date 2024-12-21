package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

    @GetMapping("/{path:[^\\.]*}")
       public String forwardToHome() {
           return "forward:/index.html";
    }
}


/**
 *@RequestMapping("/{path:[^\\.]*}")
 *     public String forwardToHome() {
 *         return "forward:/index.html";
 *     }
 *
 * @RequestMapping(value = "/{path:[^\\.]*}", method = RequestMethod.GET)
 *     public String forward() {
 *         return "forward:/index.html";
 *     }
 */