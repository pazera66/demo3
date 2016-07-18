package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by karol on 18.07.16.
 */
@Controller
public class AppController {

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView model = new ModelAndView("/index");
        return model;
    }
}
