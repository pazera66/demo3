package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by karol on 18.07.16.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/text", method = RequestMethod.GET)
    public String diplayText(){
        return "Simple text message";
    }

    @RequestMapping(value = "/new2", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView model = new ModelAndView("/new2");
        return model;
    }
}
