package org.mugil.course;

import org.mugil.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourse(){
        List<Course> courses  = new ArrayList<>();
         courseRepository.findAll().forEach(courses::add);
         return  courses;
    }


    public Course getCourse(Long id){
        return courseRepository.findOne(id);
    }

    public void updateCourse(Course course){
         courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepository.delete(id);
    }

    public void insertCourse(Course course){
      courseRepository.save(course);

    }


}
