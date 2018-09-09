package org.mugil.lesson;

import org.mugil.topic.Topic;
import org.mugil.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;


    @RequestMapping(value ="/lesson", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Lesson> getAllTopics(){

        return lessonService.getAllLesson();
    }

    @RequestMapping(value ="/lesson/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  Lesson getTopicById(@PathVariable Long id){

        return lessonService.getLesson(id);

    }

    @RequestMapping(value ="/lesson/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String deleteTopic(@PathVariable Long id){

        lessonService.deleteLesson(id);
        return "Success";
    }

    @RequestMapping(value ="/lesson", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String updateTopic(@RequestBody Lesson lesson){

        lessonService.updateLesson(lesson);
        return "Success";
    }

    @RequestMapping(value ="/lesson", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String insertTopic( @RequestBody  Lesson lesson){

        lessonService.insertLesson(lesson);
        return "Success";
    }

}
