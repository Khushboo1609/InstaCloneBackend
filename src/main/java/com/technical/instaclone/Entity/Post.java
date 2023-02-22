package com.technical.instaclone.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import  java.sql.Timestamp;

@Entity(name="Post")
public class Post {

    @Id
    @GeneratedValue
    private int Id;
    private String postId;
    private String userName;

    private String profileImage;
    private String userId;
    private String postPath ;
    private Timestamp timestamp;
    private int likeCount;
    public Post(){

    }

    public Post(int id, String postId, String profileImage,String userId, String postPath, Timestamp timestamp, int likeCount) {
        Id = id;
        this.userId=userId;
        this.profileImage=profileImage;
        this.postId = postId;
        this.postPath = postPath;
        this.timestamp = timestamp;
        this.likeCount = likeCount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String  getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public int getId() {
        return Id;
    }

    public String getPostId() {
        return postId;
    }

    public String getPostPath() {
        return postPath;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setPostPath(String postPath) {
        this.postPath = postPath;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
