package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
    @RequestMapping("/hi")
    String show()
    {
        return "<h1>This is first page</h1>";
    }
    
}
