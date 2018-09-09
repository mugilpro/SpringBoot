package org.mugil.lesson;

import org.mugil.course.Course;
import org.mugil.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLesson(){
        return lessonRepository.findAll();
    }


    public Lesson getLesson(Long id){
        return lessonRepository.getOne(id);
    }

    public void updateLesson(Lesson lesson){
        lessonRepository.save(lesson);
    }

    public void deleteLesson(Long id) {
        lessonRepository.delete(id);
    }

    public void insertLesson(Lesson lesson){
        lessonRepository.save(lesson);

    }

}
