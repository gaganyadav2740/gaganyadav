package com.crm.controller;

import com.crm.entity.Comment;
import com.crm.entity.Post;
import com.crm.repository.CommentRepository;
import com.crm.repository.PostRepository;
import com.crm.service.CommentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private  CommentRepository commentRepository;
    private CommentService commentService;

    public CommentController( CommentRepository commentRepository, CommentService commentService) {
        this.commentRepository = commentRepository;
        this.commentService = commentService;
    }
    @PostMapping("/add")
    public String  createComment(
            @RequestBody Comment comment,
            @RequestParam long postId ){

        commentService.createComments(postId, comment);
        return "Comment Created successfully : "+postId;

  }
}
