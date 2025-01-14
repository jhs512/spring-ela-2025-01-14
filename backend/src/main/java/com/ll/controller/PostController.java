package com.ll.controller;

import com.ll.document.Post;
import com.ll.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;

    @GetMapping("/in")
    public String insertData() {
        Post post = new Post();
        post.setId(UUID.randomUUID().toString());
        post.setTitle("테스트 제목 " + System.currentTimeMillis());
        post.setContent("테스트 내용 " + System.currentTimeMillis());

        postRepository.save(post);
        return "데이터가 저장되었습니다.";
    }

    @GetMapping("/out")
    public List<Post> getData() {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return posts;
    }
}
