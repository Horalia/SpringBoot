package com.learning.project1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value= "/student", method = RequestMethod.GET)
public class StudentController {

    @RequestMapping(value="/test", method=RequestMethod.GET)
    public String directTo(){
        return "test";
    }


}