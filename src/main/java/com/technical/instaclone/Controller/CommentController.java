package com.technical.instaclone.Controller;

import com.technical.instaclone.Entity.Comments;
import com.technical.instaclone.Service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentsService CommentsService;
    @PostMapping("")
    private Comments submitComent(@RequestBody Comments coment){
        return CommentsService.submitCommentToDB(coment);
    }
    @GetMapping("/{postId}")
    private ArrayList<Comments> getCommentsForPost(@PathVariable("postId")String postId)
    {
        return CommentsService.getAllCommentsForDB(postId);
    }
}
