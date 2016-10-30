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
import edu.arch.ssmpoc.Menu;
import edu.arch.ssmpoc.MenuItem;

/**
 * Created by Andy on 10/30/16.
 */

@Controller
public class DetailsController {
    @RequestMapping(value={"/details"}, method= RequestMethod.GET)
    public String inventory(Model model, Authentication authentication){
        model.addAttribute("menu",Menu.menu);
        if(authentication.getAuthorities().toArray()[0].equals("PrivilegedUser")){
        return "details";}
        else{
            return "basicdetails";
        }
    }

}
