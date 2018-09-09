package org.mugil.test;

import org.mugil.topic.Topic;

import java.util.List;

public interface TopicServiceInterface {


    public List<Topic> getAllTopic();


    public Topic getTopic(Long id);

    public void updateTopic(Topic topic);


    public void deleteTopic(Long id) ;

    public void insertTopic(Topic topic);
}
