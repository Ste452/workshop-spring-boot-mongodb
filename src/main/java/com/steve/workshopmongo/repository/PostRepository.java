package com.steve.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.steve.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
