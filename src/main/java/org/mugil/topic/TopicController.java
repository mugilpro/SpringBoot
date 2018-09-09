package org.mugil.topic;


import org.mugil.test.TestClassInterface;
import org.mugil.test.TopicServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class TopicController {


    @Autowired
    private TopicService topicService;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping(value ="/topic", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  List<Topic> getAllTopics(){

        return topicService.getAllTopic();
    }

    @RequestMapping(value ="/topic/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  Topic getTopicById(@PathVariable Long id){

        return topicService.getTopic(id);

    }

    @RequestMapping(value ="/topic/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String deleteTopic(@PathVariable Long id){

        topicService.deleteTopic(id);
        return "Success";
    }

    @RequestMapping(value ="/topic", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String updateTopic(@RequestBody Topic topic){

        topicService.updateTopic(topic);
        return "Success";
    }

    @RequestMapping(value ="/topic", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  String insertTopic( @RequestBody  Topic topic){

        topicService.insertTopic(topic);
        return "Success";
    }


}
