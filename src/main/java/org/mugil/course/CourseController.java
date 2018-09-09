package org.mugil.course;

import org.mugil.topic.Topic;
import org.mugil.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping(value ="/course", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Course> getAllTopics(){

        return courseService.getAllCourse();
    }

    @RequestMapping(value ="/course/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  Course getTopicById(@PathVariable Long id){

        return courseService.getCourse(id);

    }

    @RequestMapping(value ="/course/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String deleteTopic(@PathVariable Long id){

        courseService.deleteCourse(id);
        return "Success";
    }

    @RequestMapping(value ="/course", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String updateTopic(@RequestBody Course course){

        courseService.updateCourse(course);
        return "Success";
    }

    @RequestMapping(value ="/course", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String insertTopic( @RequestBody  Course course){

        courseService.insertCourse(course);
        return "Success";
    }


}
