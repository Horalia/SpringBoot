package com.learning.project1.Controllers;

import com.learning.project1.Services.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/student", method = RequestMethod.GET)
public class StudentControllerRest{
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(value="/json", method=RequestMethod.GET)
    public String returnStudents(){
        return studentService.jsonReturn();
    }
}