package com.technical.instaclone.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Status")
public class Status {
    @Id
    @GeneratedValue
    private int  id;
    private  String statusId;
    private String userId;
    private String path;
    private String  userName;
    private String timeStamp;
    public Status()
    {
    }

    public Status(int id, String statusId, String userId, String path, String timeStamp) {
        this.id = id;
        this.statusId = statusId;
        this.userId = userId;
        this.path = path;
        this.timeStamp = timeStamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public String getStatusId() {
        return statusId;
    }

    public String getUserId() {
        return userId;
    }

    public String getPath() {
        return path;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

