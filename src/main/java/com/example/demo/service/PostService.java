package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        return Arrays.asList(
                new Post("Первый пост!"),
                new Post("1"),
                new Post("2"),
                new Post("2")

        );
    }
}