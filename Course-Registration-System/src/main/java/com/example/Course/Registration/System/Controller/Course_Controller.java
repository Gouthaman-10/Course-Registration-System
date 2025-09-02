package com.example.Course.Registration.System.Controller;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.Course_reg;
import com.example.Course.Registration.System.Service.Course_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501")

public class Course_Controller {

    @Autowired
    Course_Service courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availablecourses();
    }

    @GetMapping("courses/entroll")
    public List<Course_reg> entroll(){
        return courseService.enroll();
    }

    @PostMapping("/courses/register")
    public String register(@RequestParam("name") String name,
                           @RequestParam("emailID") String emailID,
                           @RequestParam("courseName") String courseName) {
        courseService.register(name, emailID, courseName);
        return "Congratulations "+name+" Your "+courseName+" Course is Enrolled Successfully !";
    }
}
