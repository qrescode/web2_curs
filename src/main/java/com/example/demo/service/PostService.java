package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        return List.of(
                new Post("Всем привет! Это мой пост",new Date()),
                new Post("Hi Im a student!",new  Date()),
                new Post("I work with java!",new Date())
        );
    }
}
