package org.mugil.topic;

import org.mugil.test.TestClassInterface;
import org.mugil.test.TopicServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class TopicService  {


    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopic(){
        return topicRepository.findAll();
    }


    public Topic getTopic(Long id){
       return topicRepository.findOne(id);
    }

    public void updateTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(Long id) {
        topicRepository.delete(id);
    }

    public void insertTopic(Topic topic){
         topicRepository.save(topic);

    }

    public TopicService(){
        System.out.println("Initializing topicService");
    }
}
