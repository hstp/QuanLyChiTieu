/*
 * HomeController.java
 *
 * Sep 2, 2016
 *
 * Copyright © 2016 NhanNT
 */
package xu.ye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author NhanNT
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(method = { RequestMethod.GET })
    public String getLogin() {
	return "redirect:login";
    }
}
