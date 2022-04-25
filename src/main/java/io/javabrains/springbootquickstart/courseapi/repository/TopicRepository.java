package io.javabrains.springbootquickstart.courseapi.repository;

import io.javabrains.springbootquickstart.courseapi.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {


}
