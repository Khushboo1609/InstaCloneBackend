package com.technical.instaclone.Service;

import com.technical.instaclone.Entity.Status;
import com.technical.instaclone.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {
    @Autowired
    StatusRepo statusRepo;
    @Autowired
    UserService userService;
    public Status submitDataInDB(Status status)
    {
        return statusRepo.save(status);
    }
    public ArrayList<Status> retriveStatus(){
        ArrayList<Status>statusList=statusRepo.findAll();
        for(int i=0;i<statusList.size();i++){
            Status statusItem=statusList.get(i);
        statusItem.setUserName(userService.displayMetaDataofUser(statusItem.getUserId()).getUserName());
        }
        return statusList;
    }


}
