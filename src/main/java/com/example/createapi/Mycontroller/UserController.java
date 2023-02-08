package com.example.createapi.Mycontroller;

import com.example.createapi.Entities.Course;
import com.example.createapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private CourseService courseService;


        // here is those data that can be accessed
        @GetMapping("/courses")
        public List<Course> getCourses()
    {
        return this.courseService.getCourses();

        }
        // sigle item will be accessed

        @GetMapping("courses/{courseId}")
        public Course getCourse(@PathVariable String courseId){
        return  this.courseService.getCourse(Long.parseLong(courseId));
        }

        // post some data to the server
    
        @PostMapping("/courses")
        public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
        }

        // update course using put request
        @PutMapping("/courses")
        public Course updateCourse(@RequestBody Course course){
            return this.courseService.updateCourse(course);
        }

        // delete the course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
            try {
                this.courseService.deleteCourse(Long.parseLong(courseId));
                return new ResponseEntity<>(HttpStatus.OK);
            }catch (Exception e){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }

    }

