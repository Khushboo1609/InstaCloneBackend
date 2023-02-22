package com.technical.instaclone.Controller;

import com.technical.instaclone.Entity.Post;
import com.technical.instaclone.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    private Post submitUserPost(@RequestBody Post post) {
        return postService.submitPostToDataBase(post);
    }
    @GetMapping("")
    private ArrayList<Post>getAllPost(){
        return postService.retrivePostFromDB();
    }

    }

