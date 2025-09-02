package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.Course_reg;
import com.example.Course.Registration.System.Repository.Course_Registry;
import com.example.Course.Registration.System.Repository.Course_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Course_Service {

    @Autowired
    Course_rep courseRep;

    @Autowired
    Course_Registry courseRegistry;

    public List<Course> availablecourses() {
        return courseRep.findAll();
    }

    public List<Course_reg> enroll() {
        return courseRegistry.findAll();
    }

    public void register(String name, String emailID, String courseName) {
        Course_reg courseReg = new Course_reg(name, emailID, courseName);
        courseRegistry.save(courseReg);
    }
}
