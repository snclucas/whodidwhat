package com.hashtagplus.model;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MessageRepository extends MongoRepository<Message, String> {

    public Message findByTitle(String title);

    @Query(value = "{hashtags: ?0}")
    public List<Message> findByHashtag(String hashtag);

}