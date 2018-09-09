package org.mugil.test;

import org.mugil.topic.Topic;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TopicService2 implements TopicServiceInterface {
    @Override
    public List<Topic> getAllTopic() {
        return null;
    }

    @Override
    public Topic getTopic(Long id) {
        return null;
    }

    @Override
    public void updateTopic(Topic topic) {

    }

    @Override
    public void deleteTopic(Long id) {

    }

    @Override
    public void insertTopic(Topic topic) {

    }
}
