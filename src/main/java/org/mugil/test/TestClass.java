package org.mugil.test;

import org.mugil.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestClass implements TestClassInterface{
    @Autowired
    private TopicService topicService;

    public TestClass(){
        System.out.println("Initializing Test class");

    }
}
