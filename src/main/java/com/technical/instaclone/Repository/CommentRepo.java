package com.technical.instaclone.Repository;

import com.technical.instaclone.Entity.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepo extends CrudRepository<Comments,Integer> {
    Comments save(Comments comment);
    ArrayList<Comments> findAllByPostId(String postId);
}
