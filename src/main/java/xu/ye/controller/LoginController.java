/*
 * LoginController.java
 *
 * Sep 2, 2016
 *
 * Copyright © 2016 NhanNT
 */
package xu.ye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author NhanNT
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @RequestMapping(method = { RequestMethod.GET })
    public ModelAndView getLogin() {
	ModelAndView mdv = new ModelAndView("home/login");
	return mdv;
    }

}
