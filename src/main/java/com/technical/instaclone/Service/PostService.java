package com.technical.instaclone.Service;

import com.technical.instaclone.Entity.Post;
import com.technical.instaclone.Entity.Status;
import com.technical.instaclone.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class PostService {
    @Autowired
    PostRepo postRepo;
    @Autowired
    UserService userService;
    public Post submitPostToDataBase(Post post)
    {
        return postRepo.save(post);
    }
    public ArrayList<Post> retrivePostFromDB()
    {
        ArrayList<Post>postList=postRepo.findAll();
        for(int i=0;i<postList.size();i++){
            Post postItem=postList.get(i);
            postItem.setUserName(userService.displayMetaDataofUser(postItem.getUserId()).getUserName());
            postItem.setProfileImage(userService.displayMetaDataofUser(postItem.getUserId()).getProfileImage());
        }
        Collections.sort(postList, (a,b)->b.getId() - a.getId());
        return postList;
    }


}
