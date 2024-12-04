package com.crm.service;

import com.crm.entity.Comment;
import com.crm.entity.Post;
import com.crm.repository.CommentRepository;
import com.crm.repository.PostRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class CommentService {

    private CommentRepository commentRepository;
    private PostRepository postRepository;

    public CommentService(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }
    public void createComments(long postId, Comment comment) {
        Post post = postRepository.findById(postId).get();
        comment.setPost(post);
        commentRepository.save(comment);
    }
}
