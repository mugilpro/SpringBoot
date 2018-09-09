package org.mugil.topic;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mugil.course.Course;
import org.mugil.lesson.Lesson;
import org.mugil.validation.ValidPassengerCount;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@Entity
public class Topic {


    @NotNull
    @Id
    private Long id;

    private String name;

    private String code;

    @ManyToOne
    private Course course;

    @OneToMany
    private List<Lesson> lessons;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }


    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Topic(){

    }

    public Topic(Long id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
