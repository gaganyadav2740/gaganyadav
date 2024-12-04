package com.crm.controller;

import com.crm.entity.Post;
import com.crm.repository.CommentRepository;
import com.crm.repository.PostRepository;
import com.crm.service.CommentService;
import com.crm.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private PostService postService;
    private PostRepository postRepository;
    public PostController(PostRepository postRepository, PostService postService){
        this.postRepository = postRepository;
        this.postService = postService;
    }

    @PostMapping("/add")
    public String createPost(
        @RequestBody Post post){

        postService.createPosts(post);
        return "Posted Created successfully";
    }
    @DeleteMapping("/delete")
    public String deletePost(@RequestParam long id){
        postService.deleteById(id);
        return "Deleted Post successfully Id:"+id;
    }
}
