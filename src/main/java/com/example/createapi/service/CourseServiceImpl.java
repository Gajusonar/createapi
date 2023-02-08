package com.example.createapi.service;

import com.example.createapi.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{
   List<Course>list;
   public CourseServiceImpl(){

       list=new ArrayList<>();
       list.add(new Course(4141,"web-developer","In that you get some html, css and Javascript with bonus you will get one framework reactjs or Angularjs"));
       list.add(new Course(5151,"fullstack-developer","In that you get some html, css and Javascript with bonus you will get one framework reactjs or Angularjs"));
       list.add(new Course(3155,"fullstack-developer","In that you get some html, css and Javascript with bonus you will get one framework reactjs or Angularjs"));

   }

    @Override
    public List<Course> getCourses(){
    return list;
    }

    @Override
    public Course getCourse(long courseId) {
       Course c=null;
        for (Course course :
                list) {
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
       list.forEach(e ->{
           if (e.getId()==course.getId()){
               e.setTitile(course.getTitile());
               e.setDescription(course.getDescription());
           }
       });
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }

}
