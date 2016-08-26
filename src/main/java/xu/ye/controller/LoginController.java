package xu.ye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class LoginController {
    @RequestMapping(method={RequestMethod.GET})
    public String getHome(){
        return "redirect:login";
    }
    
    @RequestMapping(value="login", method={RequestMethod.GET})
    public ModelAndView getLogin(){
        return new ModelAndView("login");
    }
}
