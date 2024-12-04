package com.crm.service;


import com.crm.entity.Comment;
import com.crm.entity.Post;
import com.crm.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private  PostRepository postRepository;


    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;

    }
    public void createPosts(Post post) {
        postRepository.save(post);
    }
    public void deleteById(long id) {
        postRepository.deleteById(id);
    }
}
