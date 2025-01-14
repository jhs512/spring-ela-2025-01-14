package com.ll.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.ll.document.Post;

public interface PostRepository extends ElasticsearchRepository<Post, String> {
}
