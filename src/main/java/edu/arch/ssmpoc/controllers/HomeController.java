package edu.arch.ssmpoc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chris on 10/27/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value={"/", "/welcome"}, method= RequestMethod.GET)
    public String home(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model,Authentication authentication){
        String msg = "Your role is ";
        if(authentication != null){
        for(GrantedAuthority authority: authentication.getAuthorities()){
            String role = authority.getAuthority();
            msg += role;
            model.addAttribute("loggedIn",true);
            }}
        else{
            model.addAttribute("loggedIn",false);
            msg += "Anonymous_User";}
        model.addAttribute("name", name);
        model.addAttribute("role",msg);
        return "greeting";
    }
}
