package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
  CourseRepo CourseRepo;
    @Autowired
    CourseRegistryRepo CourseRegistryRepo;

    public List<Course> availableCourses() {
        return CourseRepo.findAll();
    }

    public List<CourseRegistry> enrolleedStudents() {
       return CourseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String CourseName) {
        CourseRegistry CourseRegistry=new CourseRegistry(name,emailId,CourseName);
        CourseRegistryRepo.save(CourseRegistry);
    }
}
