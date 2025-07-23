package com.example.Course.Registration.System.Controller;

import com.example.Course.Registration.System.Service.CourseService;
import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService CourseService;
  @GetMapping("Courses")
    public List<Course> availableCourse(){
        return CourseService.availableCourses();
    }
    @GetMapping("Courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
      return CourseService.enrolleedStudents();
    }
    @PostMapping("/Courses/register")
    public String enrollCourse(@RequestParam("name")String name,
                               @RequestParam("emailId")String emailId,
                               @RequestParam("courseName")String CourseName){
     CourseService.enrollCourse(name,emailId,CourseName);
     return "Congratulation! "+name+" Enrollment Successful for "+CourseName;
    }
}
