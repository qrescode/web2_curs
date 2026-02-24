package education.one.service;

import education.one.model.Post;
import education.one.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts() {

        List<Post> list = new ArrayList<>();
        for (Post p : postRepository.findAll()) {
            list.add(p);
        }
        return list;

    }

    public void createPost(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
