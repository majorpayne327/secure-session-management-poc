package edu.arch.ssmpoc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chris on 10/27/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value={"/", "/welcome"}, method= RequestMethod.GET)
    public String home(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
}
