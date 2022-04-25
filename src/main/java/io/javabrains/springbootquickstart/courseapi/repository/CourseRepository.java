package io.javabrains.springbootquickstart.courseapi.repository;

import io.javabrains.springbootquickstart.courseapi.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);
}
